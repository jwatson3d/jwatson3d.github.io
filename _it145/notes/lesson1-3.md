---
layout: post
title:  "Lesson 1-3 Developing Java Programs with NetBeans"
date:   2018-01-01 18:00:00
categories: edu snhu it145
imgfolder: /img/it145-netbeans
images:
  - name: it145-textedit.png
    thumb: it145-textedit_tn.jpg
    text: Plain text editing using TextEdit
    width: 389
    height: 209
  - name: it145-notepad++.png
    thumb: it145-notepad++_tn.jpg
    text: Java source editing using Notepad++ on Windows 10
    width: 825
    height: 365
  - name: it145-sublime-text.png
    thumb: it145-sublime-text_tn.jpg
    text: Sublime Text with the Monokai Dark Theme
    width: 600
    height: 317
  - name: it145-netbeans-new-project.png
    thumb: it145-netbeans-new-project_tn.jpg
    text: NetBeans New Project Dialog
    width: 378
    height: 109
  - name: it145-netbeans-choose-project-type.png
    thumb: it145-netbeans-choose-project-type_tn.jpg
    text: NetBeans Choose Project Dialog
    width: 721
    height: 509
  - name: it145-netbeans-new-java-app.png
    thumb: it145-netbeans-new-java-app_tn.jpg
    text: New Java Application Dialog
    width: 868
    height: 519
  - name: it145-netbeans-default-package.png
    thumb: it145-netbeans-default-package_tn.jpg
    text: Hello World in Default Package
    width: 958
    height: 504
  - name: it145-netbeans-run-program.png
    thumb: it145-netbeans-run-program_tn.jpg
    text: Run Project
    width: 942
    height: 671
---
{% include galheader.html %}
Contents
* TOC
{:toc}
<hr/>

## Basic Text Editing
Programs are written using the syntax of a particular programming language, Java in our case, and are stored in plain text files. Simple text editor programs such as [Notepad](https://en.wikipedia.org/wiki/Microsoft_Notepad) on Windows or [TextEdit](https://en.wikipedia.org/wiki/TextEdit) on Mac can be used to view and edit the program source code. These very basic editing programs really _should not be used_ for this task because programming involves complex, strict syntax rules and proper formatting. Instead, there are several specialized text editing programs designed to make writing programs easier and less error prone.

{% include gal.html image="it145-textedit.png" %}
<span style="font-size: 12px; font-weight: bold;">Plain text editing using TextEdit</span><br/>

As you can see from the above image, all the text is shown in a single black color and it mistakenly reports a spelling error on one of the lines even though it is correct, proper Java syntax. The same Java source program opened using the free <a href="https://en.wikipedia.org/wiki/Notepad%2B%2B" target="_blank" title="Notepad++">Notepad++</a>&nbsp;editor looks very different.

{% include gal.html image="it145-notepad++.png" %}
<span style="font-size: 12px; font-weight: bold;">Java source editing using Notepad++ on Windows 10</span><br/>

Notice the immediate benefit of colorizing different parts of the Java language syntax - keywords (public, class, static, void, int) are shown in one color, literal constants (20, 40, 50) are shown in another, and text between quotes ("Salary is ") are a different color. Using color is like having the Java source code "jump out" at you from the screen so you can easily distinguish different parts of the code.<br><br>Finally, here's the same program shown using <a href="https://en.wikipedia.org/wiki/Sublime_Text" target="_blank" title="Sublime Text">Sublime Text</a> on a Mac with a dark theme to reduce strain on the eyes especially during late night coding binges. Notice that the colorizing is complete and total - keywords and operators (dot, equal, multiply) are in red, class and method names green, literal text, numeric constants, semi-colons, etc. The entire source file stands out in a variety of colors to make it easier for you to scan and see parts of the code.

{% include gal.html image="it145-sublime-text.png" %}
<span style="font-size: 12px; font-weight: bold;">Sublime Text with the Monokai Dark Theme</span>

## NetBeans IDE
> <i style="color: rgb(255, 0, 0);">The easiest and most foolproof way to install NetBeans is to download the [NetBeans + Java JDK Bundle](http://www.oracle.com/technetwork/articles/javase/jdk-netbeans-jsp-142931.html) - a single installation package containing both applications that ensures the correct versions of each are used and work together properly.</i>

An <a href="https://techterms.com/definition/ide" target="_blank" title="Integrated Development Environment">Integrated Development Environment</a> (or IDE) goes way above and beyond what text editors can do by bringing in all the tools needed to develop software into a single application. IDEs not only provide colorized syntax but also <a href="https://en.wikipedia.org/wiki/Intelligent_code_completion" target="_blank" title="Intelligent Code Completion">intelligent code completion</a>&nbsp;which is similar to auto-completion and correction on phones and tablets. Imagine only having to type the first few letters of a Java keyword and have the remaining text filled in for you automatically. IDEs also are able to syntax-check your code as you develop it, flagging errors and mistakes as you type which will reduce the number of compile errors to fix later on. Finally, you can also compile and run your program right from the IDE without having to learn complicated and arcane commands.

### Projects
Developing a software application usually involves having multiple source files as well as additional resources such as image files, configuration files and other types of information. Even a moderately complex commercial application will have hundreds of files while a large one will have thousands. An application may also be written for a specific case such as running standalone on a desktop computer, running as a backend service or even as a small <a href="https://techterms.com/definition/applet" target="_blank" title="applet">applet</a> running in a browser. Each of these types of applications will require different options when compiling and building the final product. For this reason, IDEs have introduced the notion of a project to contain all the files and configuration options needed to create and build an application. <i style="color: rgb(255, 0, 0);">Unlike text editors that allow you to edit a single source file, an IDE requires a project to be defined/created in order to build software</i>.

<gcb-youtube videoid="http://www.youtube.com/watch?v=XXccdFWUDOs" instanceid="uOtpWCupyPEG"></gcb-youtube>
These are the steps to create a new project:

- Choose <b>New Project</b> from the <i>File</i> menu:<br>

{% include gal.html image="it145-netbeans-new-project.png" %}
<span style="font-size: 12px; font-weight: bold;">NetBeans New Project Dialog</span><br/>

- In the <i>New Project</i> dialog window <u>always</u> choose <b>Category: Java</b> and <b>Project Type: Java Application</b>:

{% include gal.html image="it145-netbeans-choose-project-type.png" %}
<span style="font-size: 12px; font-weight: bold;">NetBeans Choose Project Dialog</span><br/>

- In the <i>New Java Application</i> dialog window type the name of your application as the <b>Project Name</b>&nbsp;- use the same name as the Java class name for simplicity sake. This project name will become the folder name inside the <i>Documents/NetBeansProjects</i> folder on your computer.

{% include gal.html image="it145-netbeans-new-java-app.png" %}
<span style="font-size: 12px; font-weight: bold;">New Java Application Dialog</span><br/>

NOTE: In the <i>Create Main Class</i> text box (above) you should remove everything except the final class name. The part before the class name is known as a “package name” which is an advanced topic that will not be covered. Removing the auto-generated package name will result in your project being created with what is known as a “default package” - this is perfectly fine for an introductory Java course.

<i style="color: rgb(255, 0, 0);"><b>Warning!</b> <u>Failure</u> to remove the package name (everything before the final class name word) will result in your program not being able to be uploaded to a zyBooks lab assignment. This will lead to grimaces, bad words children shouldn't hear, a sense of despair, and ultimately require you to email me to bail you out by reminding you of this.</i>

- Your completed project with the default, templated Java starter code should look like this.

{% include gal.html image="it145-netbeans-default-package.png" %}
<span style="font-size: 12px; font-weight: bold;">Hello World in Default Package</span><br/>

### Running a Project
Once you have written some source code statements inside your Java class you can immediately <b>Run the Project</b>&nbsp;to test it out:

{% include gal.html image="it145-netbeans-run-program.png" %}
<span style="font-size: 12px; font-weight: bold;">Run Project</span><br/>

Notice that the Run menu option says Run Project - not “run source file”. Again, you must go through the steps above to set up a project each time you start a new…well, project (lab assignment, test program, next killer application that makes you rich and famous, etc.)

The NetBeans website contains a tutorial quick start similar to what I’ve put together here called <a href="https://netbeans.org/kb/docs/java/quickstart.html" target="_blank" title="Netbeans IDE Java Quick Start Tutorial">Netbeans IDE Java Quick Start Tutorial</a>. You can also use an Internet search engine to search for “netbeans tutorial” and you’ll find numerous videos and posts on the topic.<br><br>Lastly, you also have access to the <a href="https://snhu.skillport.com/skillportfe/login.action" target="_blank" title="Skillport e-book library">Skillport e-book library</a> where you’ll find an entire textbook devoted to this topic entitled <i>Beginning NetBeans IDE: For Java Developers</i>.

[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson1.md %})<br/>