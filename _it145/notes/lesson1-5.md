---
layout: post
title:  "Lesson 1-5 Creating Output in Java"
date:   2018-01-01 18:00:00
categories: edu snhu it145
---

The simplest type of application to create is called a <a href="https://en.wikipedia.org/wiki/Console_application" target="_blank" title="console application">console application</a> because the output is text only, shown in a console screen. To write output from a Java program to the console the <span style="font-family: &quot;Lucida Console&quot;;">System.out.print()</span> method is used.<br><gcb-youtube videoid="http://www.youtube.com/watch?v=r1pdBpSfqFY" instanceid="7g7KfRc1R61U"></gcb-youtube>
```java
public class KeepCalm {
   public static void main (String [] args) {
      System.out.print("Keep calm");
      System.out.print("and"); // Note: Does NOT print on new output line
      System.out.print("carry on");
   }
}
```
Output:
```
Keep calmandcarry on
```
Notice that there are no spaces between calm and carry. Java will print exactly what appears inside the quotes. You can correct this by putting a space before and after the and:
```java
public class KeepCalm {
   public static void main (String [] args) {
      System.out.print("Keep calm");
      System.out.print(" and "); // Note: Does NOT print on new output line
      System.out.print("carry on");
   }
}
```
With the additional space added:
```
Keep calm and carry on
```
Did you notice that while there were three Java statements, each printing a different word or words, the output continued where it had left off previously? This is an important distinction - <span style="font-family: &quot;Lucida Console&quot;;">System.out.print()</span> continues output immediately where it left off.<br /><br />

There's a separate method, <span style="font-family: &quot;Lucida Console&quot;;">println()</span>, that automatically adds a linefeed character to the end of the information being printed. Here's the same program with <span style="font-family: &quot;Lucida Console&quot;;">println()</span> statements used instead:
```java
public class KeepCalm {
   public static void main (String [] args) {
      System.out.println("Keep calm"); // println starts new line after output
      System.out.println("and");       
      System.out.println("carry on");  // Usually finish output with new line
   }
}
```
Leading to this output:
```
Keep calm   <- linefeed here
and         <- linefeed here
carry on    <- linefeed here
```
<br><span style="color: rgb(255, 0, 0); font-family: &quot;Lucida Console&quot;;"><b>Takeaway</b>: Use </span><span class="yui-tag-span yui-tag" tag="span" style="color: rgb(255, 0, 0); font-family: &quot;Lucida Console&quot;;">println()</span><span class="yui-tag-span yui-tag" tag="span" style="color: rgb(255, 0, 0); font-family: &quot;Lucida Console&quot;;"> when you want <i>future</i> output to continue on the next line.</span><br>

[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson1.md %})<br/>
<br/>
<span><small>&copy; {{ site.time | date: '%Y' }} <a href="/about" class="black">{{ site.author }}</a></small></span>
