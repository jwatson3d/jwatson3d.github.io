---
layout: post
title:  "Lesson 2-3 Java Style Guide"
date:   2018-01-01 18:00:00
categories: edu snhu it145
---
There's a big difference between syntax and style. Syntax refers to the punctuation of which the rules defined by the [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se8/html/index.html) are rigid. If the syntax is not perfectly correct, such as a missing semicolon or closing brace then the program will not compile. Style refers to **_how_** you write code - that is how it **_reads_**, how **understandable** it is to humans. Just like a poorly written paper full of misspellings, poor word choice, incomplete sentences, and rambling thoughts, a poorly written program will assault the reader and most importantly your professor!!

> <span style="font-size: 14px; font-weight: bold;">"Any fool can write code that a computer can understand. Good programmers write code that humans can understand."</span>
> 
> <span style="font-size: 14px; font-weight: bold;">--- Martin Fowler, Refactoring: Improving the Design of Existing Code</span>

There are a number of Style Guides, some longer and more detailed, that define what constitutes good programming style. Some common rules you should follow:

### Capitalization

1. **Classes** - First letter of every word uppercase, remaining letters lowercase. Class names should be nouns as they represent concrete objects in the real world.<br/><br/>
    OutputWithVars, PaintEstimator, Person, etc.<br/><br/>
2. **Methods** - Initial letter lowercase, remaining words have first letter uppercase. Method names should be verbs as they represent actions being performed on something.<br/><br/>
    main, getHashedPassword, prepareFile, calculatePay, etc.<br/><br/>
3. **Variables** - Initial letter lowercase, remaining words have first letter uppercase. Variable names should be meaningful, not user1, user2, user3, etc.<br/><br/>
    firstName, userInput, etc.

### Formatting

1. **Comments** - Inline, above the code they explain. DO NOT use "end-of-line" comments following right after the code on the same line. Do not be redundant.<br/><br/>
    int age = 0; // declare age <span style="color: #ff0000;"><--redundant!</span><br/><br/>
    // prompt for an integer<br/>
    System.out.println("Enter integer: ");<br/>
    userNum = scnr.nextInt();<br/>

2. **Whitespace** - Use a blank line to separate logical sections or "groups" of code. Leave a space after keywords and between binary operators. Leave spaces before and after parenthesis - don't squish code together.

3. **Indentation** - Blocks of code should be indented together the same number of spaces. Comments should be indented at the same level as the code they immediately preceed. |

## Additional Resources
I **strongly** encourage you to review these resources to quickly gain an understanding of what constitutes good programming style:

* [Java Ranch Programming Style Guide](https://www.javaranch.com/styleLong.jsp)
* Roedy Green's [Java Coding Conventions](http://mindprod.com/jgloss/codingconventions.html)
* [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
* Sun Microsystems original [Java Coding Conventions](http://www.oracle.com/technetwork/java/codeconvtoc-136057.html) (circa 1999)
* [Commenting in Java](https://www.clear.rice.edu/comp310/JavaResources/comments.html)

[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson2.md %})<br /><br/>
<span><small>&copy; {{ site.time | date: '%Y' }} <a href="/about" class="black">{{ site.author }}</a></small></span>

