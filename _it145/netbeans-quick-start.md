---
layout: post
title:  "Netbeans Quick Start"
date:   2017-07-05 15:00:00
categories: edu snhu it145
imgfolder: /img/it145-netbeans
images:
  - name: it145-netbeans-new-project.png
    thumb: it145-netbeans-new-project_tn.jpg
    text: New Project
    width: 378
    height: 109
  - name: it145-netbeans-choose-project-type.png
    thumb: it145-netbeans-choose-project-type_tn.jpg
    text: Project Type
    width: 721
    height: 509
  - name: it145-netbeans-new-java-app.png
    thumb: it145-netbeans-new-java-app_tn.jpg
    text: New Java Application
    width: 868
    height: 519
  - name: it145-netbeans-default-package.png
    thumb: it145-netbeans-default-package_tn.jpg
    text: Default Package
    width: 958
    height: 504
  - name: it145-netbeans-project-source.png
    thumb: it145-netbeans-project-source_tn.jpg
    text: Project Source
    width: 583
    height: 183
  - name: it145-netbeans-run-program.png
    thumb: it145-netbeans-run-program_tn.jpg
    text: Run Program
    width: 942
    height: 671
  - name: it145-notepad++.png
    thumb: it145-notepad++_tn.jpg
    text: Notepad++
    width: 825
    height: 367
  - name: it145-sublime-text.png
    thumb: it145-sublime-text_tn.jpg
    text: Sublime Text
    width: 600
    height: 317
---
{% include galheader.html %}
Contents
* TOC
{:toc}
<hr/>

# Overview
These notes are intended to help you quickly become productive using the [NetBeans](https://netbeans.org/features/java/) Integrated Development Environment, or IDE. IDEs are a category of software that provide sophisticated tools for developing programs and entire applications. Some other IDEs for Java include [Eclipse](https://projects.eclipse.org/projects/eclipse.jdt), the most popular with around 50% market share, and [IntelliJ](https://www.jetbrains.com/idea/). Eclipse is completely open-source while IntelliJ is commercial but also offers an open-source community edition.

<br/>
# Projects
Whereas _text editors_ (see below) are great for viewing a single source file, IDEs use the concept of a programming **project** to manage multiple source files and settings necessary to build a complete application. While you can open a single source file and are able to view, change and save it you won’t be able to do much else such as compile (sometimes called build) or run the program without having created a project first.

1. After starting NetBeans choose **New Project** from the file menu:<br/>{% include gal.html image="it145-netbeans-new-project.png" %}

2. In the _New Project_ dialog window _always_ choose **Category: Java** and a **Project Type: Java Application**<br/>{% include gal.html image="it145-netbeans-choose-project-type.png" %}

3. In the _New Java Application_ dialog window type the name of your application as the Project Name, normally this is also the name of your Java source file and Java class name.<br/>{% include gal.html image="it145-netbeans-new-java-app.png" %}

4. In the _Create Main Class_ text box (above) you should remove everything except the final class name. The part before the class name is known as a “package name” which is an advanced topic that will not be covered. Removing the package name will result in your project being created with what is known as a “default package” - this is perfectly fine for an introductory Java course.<br/>{% include gal.html image="it145-netbeans-default-package.png" %}

Most importantly, if you forget to remove that package name portion you will have trouble when you try to copy/paste or upload your assignment to the zyBooks lab assignment page. zyBooks does not support package names and your program will not compile or run in zyBooks with a package name in it. If you forget this step, you will need to either delete or comment out the package name statement that gets automatically created in your source file before you can upload and run your program in zyBooks.

**Notes:**<br/>
- Java class names cannot contain spaces in the name so you’ll need to “mash” together words as shown above, so "Hello World" becomes "HelloWorld". The only special characters you should use are dash or underscore.

- You can make your project name something different from the Java class name, such as “Lab 1.13” (with a blank space after “Lab”) for a project name and “OutputWithVars” for the class name (no blank spaces between words).

- The project name is used as the folder (directory) name on your computer. Inside that folder you’ll find a “src” folder that contains all the Java source files used in the project:<br/>{% include gal.html image="it145-netbeans-project-source.png" %}

<br/>
# Running A Program
Once you have written some source code statements inside your Java class you can immediately Run the program to test it out:<br/>{% include gal.html image="it145-netbeans-run-program.png" %}
Note that the Run menu option says **Run Project** - not “run source file”. Again, you must go through the steps above to set up a project each time you start a new…well, project (lab assignment, test program, next killer application that makes you rich and famous, etc.)

The NetBeans website contains a tutorial quick start similar to what I’ve put together here called [Netbeans IDE Java Quick Start Tutorial](https://netbeans.org/kb/docs/java/quickstart.html). You can also use an Internet search engine to search for “netbeans tutorial” and you’ll find numerous videos and posts on the topic.

Lastly, you also have access to the [Skillport e-book library](https://snhu.skillport.com/skillportfe/login.action) where you’ll find an entire textbook devoted to this topic entitled Beginning NetBeans IDE: For Java Developers.

<br/>
# Text Editors
A “lower” class of programming tools is called text editors which are essentially programs similar to Notepad on Windows and TextEdit on Mac. These tools let you edit text files and provide colorized syntax highlighting making it much easier to see and recognize parts of a program source file. Because they are much simpler, these editors launch very quickly as compared to a full-featured IDE and can be useful when you are just looking at a source file rather than sitting down to build and debug a complete program. Once you begin using a colorizing text editor you will never want to view source code in a single-color, plain text format again!

[Notepad++](https://notepad-plus-plus.org/download/)<br/>{% include gal.html image="it145-notepad++.png" %}

<br/>
[Sublime Text](http://www.sublimetext.com/)<br/>{% include gal.html image="it145-sublime-text.png" %}
