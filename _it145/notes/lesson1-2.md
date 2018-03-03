---
layout: post
title:  "Lesson 1-2 Writing Your First Program"
date:   2018-01-01 18:00:00
categories: edu snhu it145
---

The canonical entry into a programming language is the <a href="https://en.wikipedia.org/wiki/%22Hello,_World!%22_program" target="_blank" title="Hello, World">Hello, World</a> program. Here is the Java version:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
Java is an object-oriented programming language whereby all source code is contained within <a href="https://techterms.com/definition/class" target="_blank" title="Class">classes</a>. In this example the class is named <i>HelloWorld</i>.

One of the first rules of Java to learn is that <b>the filename of the Java source file must be the same as the class name followed by the ".java" file extension</b> so the above class would be saved in a file called "HelloWorld.java". Java is also a <b>case sensitive language</b> so "helloWorld" (lowercase "h") is not the same as "HelloWorld" (uppercase "H") - these would be considered two different programs due to the different filenames.. For Windows users this can require some getting used to because Windows is notoriously lax about case sensitivity while Unix (and Java) strictly enforce case sensitivity.

Another rule of Java is that <i>whitespace</i> (spaces, tab characters, line feeds) are ignored except when they are located between quotes, that is within a quoted string. The following two examples both contain legal Java syntax that will compile and produce the exact same output:
```java
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
    }
}
```
```java
public class HelloWorld {
public static void main(String[] args){
System.out.println("Hello, World!");}}
```
Notice that the spacing and linefeeds around the Java keywords have been altered but the content within the quotes is identical. While all three forms of source code layout are legitimate Java syntax only the first two are considered proper form while the last example is considered bad form. If you submit source code looking like the last example for a class asisgnment you will lose points. Worse, if you develop these bad formatting habits you may well lose your job as a professional programmer in the future.

All programs need a starting point and for programming languages derived from C, including Java, this is the <i>main()</i> method. When you run a Java program the class file gets loaded by the <a href="https://techterms.com/definition/jvm" target="_blank" title="Java Virtual Machine">JVM</a> and then the <i>main()</i> method is located and program execution always starts with the first statement located within the <i>main()</i> method. Methods will be covered later in the course so for now just know that every program requires one method called <i>main()</i>.

Notice the opening and closing curly braces - these define the boundaries of a class, method, and block of code. As you can see the <i>main()</i> method has one statement enclosed in its curly braces and the entire <i>main()</i> method is itself contained with the curly braces that define the HelloWorld class. It goes without saying that opening and closing curly braces must be paired and matched - each opening curly brace requires a corresponding closing curly brace.

[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson1.md %})<br/>