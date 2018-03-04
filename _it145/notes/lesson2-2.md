---
layout: post
title:  "Lesson 2-2 Operators"
date:   2018-01-01 18:00:00
categories: edu snhu it145
---
[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson2.md %})<br />

While declaring variables with an initial value is convenient, all but the simplest, trivial programs will need to store different values at different times. In order to <i>assign</i> a new value to a variable we use syntax similar to what we saw for the initial value:
```java
// declare and assign initial values
double bitcoin = 16,011.00;
int coinsInPurse = 4;

// declare only
double totalValue;

// perform multiplication and assign result of 64,044 to "totalValue"
totalValue = coinsInPurse * bitcoin;
```
You may have spent your entire life referring to the symbol "=" as "equal sign" but it is more properly known as the [assignment operator](https://en.wikipedia.org/wiki/Assignment_(computer_science)). In fact, there are several common math symbols that in programming terms are referred to as the basic operators:

| Operator | Name | Description |
| :---: | --- | --- |
| = | Assignment | Stores the value derived from the right side in the variable on the left. (note 1) |
| + | Addition | Combines the two values (addition for numeric expressions/variables and concatenation for string literals/variables. (note 2) |
| - | Subtraction | Subtracts the right-most value from the left value. |
| * | Multiplication | Multiplies two values together. |
| / | Division | Divides the left value (dividend) by the right value (divisor). |
| % | Modulo Division | Divides the left value (dividend) by the right value (divisor) and returns the REMAINDER. |

> Note 1: The data type of the variable receiving the assignment can be any type as long as the expression on the right of the operator resolves to the same type.
> 
> Note 2: Applies to String data types as well as numeric data types.

Based on this table, you can see that I snuck in a couple of operators on the last line of the code sample above. First, I used the multiplication operator to multiply the current values of two variables together (<i>coinsInPurse</i> and <i>bitcoin</i>) and then the result was <i>assigned</i> to the variable <i>totalValue</i>.

[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson2.md %})<br /><br/>
<span><small>&copy; {{ site.time | date: '%Y' }} <a href="/about" class="black">{{ site.author }}</a></small></span>

