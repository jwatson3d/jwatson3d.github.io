---
layout: post
title:  "Lesson 3-1 Conditional Logic"
date:   2018-01-01 18:00:00
categories: edu snhu it145
---
## Conditional Logic

When you're on a road trip you will reach a point where you need to get off the highway to gas up your car. This situation perfectly illustrates conditional logic in programming that can be expressed as
```java
// less than a quarter tank
if (fuelGuage < .25) {
  takeNextExit()
}
```
<br/>
In fact, you could decide to perform several actions including
```java
if (fuelGuage < .25) {
  fillUpTank();
  visitRestroom();
  getSomethingToEat();
}
```
<br/>
The conditional statement follows the format
```java
if (condition-is-true) { 
    // statements-to-execute
    statement1;
    statement2;
    statement3;
}
```
<br/>
Any statements within the curly braces will be executed if the condition within the parenthesis resolves to ```true```. This feature is probably one of the most basic and most used constructs in programming. A variation of this kind of logic processing would be to execute one set of statements if the condition is true and a different set of statements if the condition is false.
```java
if (condition-is-true) { 
    // statements-to-execute-when-true
    statement1;
    statement2;
    statement3;
} else {
    // statements-to-execute-when-false
    statement4;
    statement5;
    statement6;
}
```
<br/>
zyBooks Fig. 3.1.1 illustrates this logic in actual code
```java
System.out.print("Enter age: ");
userAge = scnr.nextInt();

if (userAge < 25) {
   insurancePrice = PRICE_LESS_THAN_25;
   System.out.println("(executed first branch)");
} 
else {
   insurancePrice = PRICE_25_AND_UP;
   System.out.println("(executed second branch)");
}

System.out.println("Annual price: $" + insurancePrice);
```

## Relational Operators

Programming follows the well-known symbols used in mathematics to code statements where one variable is evaluated in relationship to another

| **Operator** | **True when...** |
| :---: | :---: |
| a < b | a is *less* than b |
| a > b | a is *greater* than b |
| a == b | a *equals* b |
| a <= b | a is *less than or equal* to b |
| a >= b | a is *greater than or equal* to b |
| a != b | a is *not equal* to b |

Notice that equality uses **two equal signs** - this often trips up beginning programmers as it may not seem natural. However, we have already learned that a _single_ equals sign is known as the _assignment_ operator and is used to assign a value to the variable on the left. A different symbol is needed to distinguish between whether a statement is intended to assign a value or compare two values, thus the double equals sign.

<span style="color: rgb(255, 0, 0);">**NOTE**: Relational operators work best when comparing primitive data types (int, double, char, etc.). Trying to use them to compare objects, including Strings, will almost often yield unexpected or undesired results.</span>

[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson3.md %})<br /><br/>
<span><small>&copy; {{ site.time | date: '%Y' }} <a href="/about" class="black">{{ site.author }}</a></small></span>