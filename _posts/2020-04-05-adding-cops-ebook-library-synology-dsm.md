---
title:  "Adding the COPS eBook Library to Synology DSM"
date:   2020-04-05 21:00:00
excerpt: "What I learned and did to get COPS running"
categories:
  - blog
tags:
  - cops
  - synology
---
Contents
* TOC
{:toc}
<hr/>

__Introduction__

As technical reference material becomes digitized, the need to organize and quickly find it grows. [Calibre](https://calibre-ebook.com/) is a feature-rich, free e-book management system that supports finding and downloading metadata, tagging, searching, and sorting your library. Calibre is provided as a rich, desktop client application that works great on whatever computer you are using. You can even store the library on a shared folder to allow access from multiple machines. With a Synology NAS and its DSM you can install the [Calibre OPDS (and HTML) PHP Server](https://blog.slucas.fr/projects/calibre-opds-php-server/)  (COPS) web server and make the library available from anywhere.


__Installation__

1. Install/enable DSM Web Station
1. Install Apache HTTP Server
1. Install PHP 5.6
1. Download the latest COPS package from [SynoCommunity](https://synocommunity.com/package/cops), currently v1.0.1-5 beta
1. Use the Manual Install feature in DSM Package Center to install.
1. Create a new top-level shared folder such as ‘calibre’ to hold the e-book library


__Configuration__

Sébastien Lucas’ [wiki](https://github.com/seblucas/cops/wiki) covers the steps to configure COPS for Synology. My notes for DSM 6.2.2 are:

1. You need to ssh to your NAS
1. Packages are located at /volume1/@appstore
1. Websites are located at /volume1/web
1. COPS website is /volume1/web/cops
1. Copy the example local configuration file: cp /volume1/web/cops/config_local.php.example /volume1/web/cops/config_local.php
1. Edit the config_local.php to specify the location of the Calibre library: $config['calibre_directory'] = '/volume1/calibre/';

__Security__

If the COPS website will be exposed outside of the network follow [How do I protect folders under the shared folder "web" from unprivileged access?](https://www.synology.com/sv-se/knowledgebase/DSM/tutorial/Management/How_do_I_protect_my_folders_in_the_quot_web_quot_shared_folder_from_unprivileged_access). Here’s how to set up simple but effective user and password authentication

```bash
# make a directory to hold passwords (must be accessible by Apache)
> mkdir /volume1/web/passwd

# create a digest admin password file
> htdigest -c /volume1/web/passwd/admin.pw realm admin

# create Apache hypertext access file
# see ([http://www.htaccess-guide.com/](http://www.htaccess-guide.com/))
> vim /volume1/web/passwd/.htaccess
AuthUserFile /volume1/web/passwd/admin.pw
AuthType Digest
AuthName "realm"
Require valid-user

# create a digest user password file
> htdigest -c /volume1/web/passwd/users.pw cops billyjoe
# create Apache hypertext access file
# see http://www.htaccess-guide.com/
> vim /volume1/web/cops/.htaccess
AuthUserFile /volume1/web/passwd/users.pw
AuthType Digest
AuthName "cops"
Require valid-user
```

__Notes__

Because the Calibre directory is shared on the Synology NAS you can maintain it using the rich client:
<br/><br/>
<a href="/assets/images/posts/calibre.png"> <img style="background-image: none; border-right-width: 0px; padding-left: 0px; padding-right: 0px; display: inline; float: left; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px; padding-top: 0px" title="calibre" border="0" alt="calibre" align="right" src="/assets/images/posts/calibre_thumb.png" /></a>
<br/><br/>
The default web interface is kind of outdated:
<br/><br/>
<a href="/assets/images/posts/COPS-default.png"> <img style="background-image: none; border-right-width: 0px; padding-left: 0px; padding-right: 0px; display: inline; float: left; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px; padding-top: 0px" title="COPS-default" border="0" alt="COPS-default" align="right" src="/assets/images/posts/COPS-default_thumb.png" /></a>
<br/><br/>
However the bootstrap version is more modern looking:
<br/><br/>
<a href="/assets/images/posts/COPS-bootstrap.png"> <img style="background-image: none; border-right-width: 0px; padding-left: 0px; padding-right: 0px; display: inline; float: left; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px; padding-top: 0px" title="COPS-bootstrap" border="0" alt="COPS-bootstrap" align="right" src="/assets/images/posts/COPS-bootstrap_thumb.png" /></a>
<br/><br/>
Selecting a book title shows details about the book, including metadata and links to download various formats from the library:
<br/><br/>
<a href="/assets/images/posts/COPS-default-details.png"> <img style="background-image: none; border-right-width: 0px; padding-left: 0px; padding-right: 0px; display: inline; float: left; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px; padding-top: 0px" title="COPS-default-details" border="0" alt="COPS-default-details" align="right" src="/assets/images/posts/COPS-default-details_thumb.png" /></a>
<br/>