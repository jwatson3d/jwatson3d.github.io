---
title: First Foray into Windows Home Server (WHS)
date: '2011-04-15T22:09:00.001-04:00'
author: John Watson
excerpt: I just inherited an HP EX485 MediaSmart Server in near new condition. First impression is that it is *tiny* — about as tall as a college textbook standing on edge and six inches wide. WHS machines are network-ready, do not have a VGA output nor display adapter and typically have multiple drive bays designed for adding low cost serial ATA (SATA) drives as storage needs grow...
tags:
  - whs
  - homeserver
  - nas
modified_time: '2011-04-15T22:09:23.138-04:00'
thumbnail: http://lh3.ggpht.com/_BvH8o_BvG-4/Taj6SINysmI/AAAAAAAAAXI/KZr4TN7c08Y/s72-c/system_disk_thumb.png?imgmax=800
blogger_id: tag:blogger.com,1999:blog-2811308028656623966.post-3303865363597652386
blogger_orig_url: http://pragmatic-software.blogspot.com/2011/04/first-foray-into-windows-home-server.html
---

I just inherited an [HP EX485 MediaSmart Server](https://www.engadget.com/2008/12/29/hp-debuts-mac-compatible-mediasmart-ex485-ex487-home-servers/) in near new condition. First impression is that it is _***tiny***_ — about as tall as a college textbook standing on edge and six inches wide. WHS machines are network-ready, do not have a VGA output nor display adapter and typically have multiple drive bays designed for adding low cost serial ATA (SATA) drives as storage needs grow.<br />

<a href="/assets/images/posts/whs_system_disk.png"> <img style="background-image: none; border-right-width: 0px; padding-left: 0px; padding-right: 0px; display: inline; float: right; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px; padding-top: 0px" title="system_disk" border="0" alt="system_disk" align="right" src="/assets/images/posts/whs_system_disk_thumb.png" /></a> The EX485 comes with a single 750 GB drive partitioned with a small 20 GB system (“C:\”) and the remainder as a large “D:\” data drive. The [specifications](/assets/images/posts/ex485ex4871.pdf) don't state this but fully loaded with four drives it will consume a paltry 76 watts of power!

WHS is an interesting, strange brew – a fully-functioning Windows server product with an easy to use setup and interface sold only to OEMs. The intention is to provide something dead-simple to setup that consumers can take home, plug-in and it just works. Scott Hanselman wrote a nice introductory review of WHS and the MediaSmart [here](http://www.hanselman.com/blog/ReviewHPMediaSmartWindowsHomeServer.aspx). As the name suggests, the EX485 is designed to store and serve media – movies, music and photos.

<a href="/assets/images/posts/whs_console.png"> <img style="background-image: none; border-right-width: 0px; padding-left: 0px; padding-right: 0px; display: inline; float: right; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px; padding-top: 0px" title="whs_console" border="0" alt="whs_console" align="right" src="/assets/images/posts/whs_console_thumb.png" /></a> Under the covers WHS v1 is Windows Server 2003 so it’s a solid and reliable server platform. It exposes a user-friendly console that OEMs can extend to provide functionality as shown here. Notice the small link indicated in the upper right that opens a settings panel where you can configure the server – again the dialog is extensible by OEMs.

<a href="/assets/images/posts/whs_upnp.png"> <img style="background-image: none; border-bottom: 0px; border-left: 0px; padding-left: 0px; padding-right: 5px; display: inline; float: left; border-top: 0px; border-right: 0px; padding-top: 0px" title="whs_upnp" border="0" alt="whs_upnp" align="left" src="/assets/images/posts/whs_upnp_thumb.png" /></a> WHS supports universal plug and play (UPnP) so other machines in your home network can discover and access it. From there you can install a client “connector” that gives you access to the console shown above. Connecting a client machine is sort of like an ultra-light version of joining a domain without the intrusive “taking over”.<br />

Client computers will get a “Shared Folders” link on their desktop that shows all the pre-configured shares (e.g. Documents, Music, Photos, Videos) on the server as well as any custom ones you’ve added. A “Windows Home Server Connector Service” will be installed along with a system tray icon and nightly backups will be configured.<br />

<a href="/assets/images/posts/ex485_server.png"> <img style="background-image: none; border-bottom: 0px; border-left: 0px; padding-left: 0px; padding-right: 5px; display: inline; float: left; border-top: 0px; border-right: 0px; padding-top: 0px" title="ex485_server" border="0" alt="ex485_server" align="left" src="/assets/images/posts/ex485_server_thumb.png" /></a> Windows Home Server 2011 (a.k.a. v2) was released a couple of weeks ago. While articles are popping up that show how to wipe the existing v1 and install the shiny new toy I’m going to stay put. I’m currently running HP MediaSmart Server v2.5.15.35297 which was released in April 2009\. The system shipped with this configuration and it’s got the latest patches and updates. I expect to be running this until the hardware fails or becomes so outdated that it becomes compelling to update to a newer platform.  
