---
layout: post
title:  "Lesson 2-1 Variables and Data Types"
date:   2018-01-01 18:00:00
categories: edu snhu it145
---
## Background
Computers store data in [memory](https://techterms.com/definition/memory) and each piece of memory is assigned a sequential number known as its [memory address](https://en.wikipedia.org/wiki/Memory_address). In the early days of programming the data was accessed by referencing the memory <i>address</i> and, while very efficient, addresses are also error prone (typos, hard to remember, etc.). Much like the contacts list on your mobile phone allows you to store, retrieve and use phone numbers by assigning a meaningful name to that number (e.g. Mom, Jenny, Mary, Delish Pizza Pies, etc.) programs have [variables](https://techterms.com/definition/variable) that are used to refer to the memory address where a piece of data is stored. Rather than trying to remember [867-5309](https://en.wikipedia.org/wiki/867-5309/Jenny) we simply look up Jenny and then press the icon to dial that number. In the same manner, rather than writing "add 1 to the value stored at memory address 65,432" we can write `add 1 to age` where `age` is the variable name we've given to represent the address 65,432.

In programming terms we have to <i>declare</i> a variable which is to say we're telling the compiler that we will be using a variable called "age". Imagine this as writing `declare age` for now. One problem is that the compiler doesn't know what age will hold for a value - is it going to be a two-digit number or will it be used for a long string of characters like "2500 North River Road, Manchester, NH 03106"?

> *Side Note*: The astute reader will recognize that using a two-digit number to hold an age value assumes that nobody will live to 100 or beyond. This same short-sightedness lead to a global phenomenon known as the [Year 2000 Problem](https://en.wikipedia.org/wiki/Year_2000_problem) or [Y2K Bug](https://www.nationalgeographic.org/encyclopedia/Y2K-bug/) at the turn of the century when only two digits were used to store a year.

In order to use a variable to refer to a memory address we actually need two pieces of information - the <i>name</i> of the variable and some way to tell <i>how much</i> memory will be needed to hold the value. The <i>how much</i> aspect can be generalized into the types of data that will be stored, or [data types](https://techterms.com/definition/datatype). A common set of data types are referred to in most programming languages:

* [Integer](https://techterms.com/definition/integer) - a whole number that can be positive, negative, or zero. Examples of integers are 5, 0, -10 while 3.14 is not because it has a fractional part of a whole number.
* [Floating Point](https://techterms.com/definition/floatingpoint) - numbers that include a decimal point and a fractional part. Examples of floating point numbers are 3.14, -459.67
* [Character](https://techterms.com/definition/character) - represents a single character, think of it as a single keypress on your keyboard including the special characters.
* [String](https://techterms.com/definition/string) - a group of characters, also known as text. A String could refer to (or hold) a single word, a sentence, a paragraph, or even an entire paper.
* [Boolean](https://techterms.com/definition/boolean) - a special logical data type that has two possible values, true or false, sometimes represented as 1 or 0.

The earlier examples of age and address can now be shown properly coded in Java as:
```java
int age;
String address;
```
## Primitive Data Types
Here's a list of the eight <i>built-in</i> or [primitive](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html) Java data types that can be used to define variables:

| Data type | Size | Range |
| --------- | :----: | :-----: |
| byte | 1 byte | -128 to 127 |
| short | 2 bytes | -32,768 to 32,76 |
| int | 4 bytes | -2,147,483,648 to 2,147,483,647 |
| long | 8 bytes | -2^63 to 2^63-1 |
| oat | 4 bytes | -3.4 * 10^38 to 3.4 * 10^38 |
| double | 8 bytes | -1.7 * 10^308 to 1.7 * 10^308 |
| boolean | 1 bit | special keyword values of 'true' or 'false' |
| char | 2 bytes | single [Unicode](https://techterms.com/definition/unicode) character |

Notice that the built-in primitive data types are written in all lower-case letters - that's a visual indication that they're intrinsic keywords that are part of the Java language. Also notice that the `String` data type shown in an earlier example is not listed. That's because it's not a part of the built-in language but rather is created as a Class with more functionality than a simple, primitive data type. You'll learn more of this distinction as the course progresses but for reference, here's a link to the official Java Documentation (a.k.a. "JavaDoc") for a [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) class.

## Example Statements
Here are some example Java statements showing variable declarations:
```java
int age;         // defines variable only (default value assigned is zero)
int herAge = 37; // defines variable, sets initial value to 37

boolean isHappy = false; // defines variable, sets initial value to 'false'

double pi = 3.14;
double absoluteZero = -459.67;

String word = "";  // defines a string variable, sets initial value to an empty string (nothing between the quotes)
String phoneNumber = "867-5309"; // Jenny's number
String address = "2500 North River Road, Manchester, NH 03106";
```

[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson2.md %})<br /><br/>
<span><small>&copy; {{ site.time | date: '%Y' }} <a href="/about" class="black">{{ site.author }}</a></small></span>

