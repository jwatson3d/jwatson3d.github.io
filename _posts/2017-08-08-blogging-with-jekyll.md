---
layout: post
title:  "Blogging with Jekyll"
date:   2017-08-08 22:00:00
excerpt: This version of my blog is build using GitHub Pages and Jekyll
---
This version of my blog is built using [GitHub Pages](https://pages.github.com/) and [Jekyll](https://jekyllrb.com/). The article [Using Jekyll as a static site generator with GitHub Pages](https://help.github.com/articles/using-jekyll-as-a-static-site-generator-with-github-pages/) details how to integrate the two while the [Mastering Markdown](https://guides.github.com/features/mastering-markdown/) article introduces the text markup language knows as markdown.

Previously, it was common to use a [content management system](https://en.wikipedia.org/wiki/Content_management_system) such as [Wordpress](https://en.wikipedia.org/wiki/WordPress), [Drupal](https://en.wikipedia.org/wiki/Drupal), [DNN](https://en.wikipedia.org/wiki/DotNetNuke), [Weblogs](https://weblogs.asp.net/), and such. Blogging was an easy task to explore the features and capabilities of the (at that time) hot technology. It wasn't really the best choice for that task because, by definition, once a blog post is written it doesn't change again. The overhead of a database-backed, dynamic system constantly creating HTML on the fly for every request really was over kill.

Static content generators such as Jekyll are really a better fit because a post can be converted to static pages and those HTML pages pushed to a web server where they live forever. Translation occurs once when the site is generated from markup instead of during every web request sent to the server.