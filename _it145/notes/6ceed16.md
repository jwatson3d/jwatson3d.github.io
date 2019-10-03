---
layout: post
title:  "IT-145 Tidbit #5"
date:   2019-10-02 21:00:00
categories: edu snhu it145
imgfolder: /img/it145-eclipse
images:
  - name: dog_vars.png
    thumb: dog_vars_tn.png
    text: Generate getters and setters
    width: 436
    height: 391
  - name: dog_generate.png
    thumb: dog_generate_tn.png
    text: Generate options
    width: 253
    height: 301
  - name: dog_getset.png
    thumb: dog_getset_tn.png
    text: Generated getters and setters
    width: 303
    height: 329
  - name: dog_tostring.png
    thumb: dog_tostring_tn.png
    text: Generate toString() method
    width: 274
    height: 227
  - name: dog_ctor.png
    thumb: dog_ctor_tn.png
    text: Generate constructor
    width: 303
    height: 356
  - name: dog_done.png
    thumb: dog_done_tn.png
    text: Generated code
    width: 275
    height: 264
---
{% include galheader.html %}
Contents
* TOC
{:toc}
<hr/>
## Getters and Setters
It is said that a picture is worth a thousand words so here's a few G's to make your programming life better... 

{% include gal.html image="dog_vars.png" %}
<span style="font-size: 12px; font-weight: bold;">Source -> Generate</span>
<br/>

{% include gal.html image="dog_generate.png" %}
<span style="font-size: 12px; font-weight: bold;">Generate options</span>
<br/>

That's right! Make your tool do the busy work of generating boilerplate getters and setters from your variable declarations. 

{% include gal.html image="dog_getset.png" %}
<span style="font-size: 12px; font-weight: bold;">Generated getters and setters</span><br/>

## toString()
The same goes for a `toString()` method...

{% include gal.html image="dog_tostring.png" %}
<span style="font-size: 12px; font-weight: bold;">Generate toString() method</span><br/>

## Constructor
Why stop there? How about some constructor love...

{% include gal.html image="dog_ctor.png" %}
<span style="font-size: 12px; font-weight: bold;">Generate constructor method</span><br/>

{% include gal.html image="dog_done.png" %}
<span style="font-size: 12px; font-weight: bold;">Generated code</span><br/>

## Conclusion
With a few clicks of the mouse you can blast out a big chunk of boilerplate code. This is part of the power of using an IDE - a *tool* for developers. Stop typing everything by hand or using an inferior text editor...use the Force, Luke!

<br/>
<span><small>&copy; {{ site.time | date: '%Y' }} <a href="/about" class="black">{{ site.author }}</a></small></span>
