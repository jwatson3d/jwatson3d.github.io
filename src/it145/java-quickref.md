---
title:  "Java Quick Reference"
categories: edu snhu it145
---
## Defining variables:
```java
int userInt = 7; // whole numbers
double userDouble = 4.9; // fractional numbers with decimals
char userChar = '-';  // a single character
String userString = "Hello world"; // string of characters
boolean exitRequested = false;
```
<br />
## Displaying output on the console:
```java
System.out.print("Hi there!"); // literal text between quotes
System.out.println("Hi there!"); // same with line feed after

int age = 27
System.out.print("Age is " + age); // literal and variable

// displays 7 4.9 - Hello world
System.out.println(userInt + " "
                 + userDouble + " " 
                 + userChar + " " 
                 + userString);

int myNum = (int)userDouble; // CAST double to integer
System.out.println("My number is: " + myNum); // prints 4
```
<br />
## Prompting the user and displaying output:
```java
Scanner scnr = new Scanner(System.in);

System.out.println("Enter integer: ");
userInt = scnr.nextInt();
System.out.println("You entered: " + userInt);

System.out.println("Enter first name: ");
String firstName = scnr.next();
System.out.println("Enter last name: ");
String lastName = scnr.next();
System.out.println("Welcome " + firstName + " " + lastName + "!");
```
<br />
## Math functions:
```java
// Calc number of cans needed, rounded up to nearest integer
int cansNeeded = (int)Math.ceil(gallonsPaintNeeded / gallonsPerCan);

// Prevent a negative result
int applesToOrder = Math.max(0, (applesToStock - applesOnHand));

// Rounding
System.out.println(Math.round(5.1) + " " + Math.round(6.7)); // 5 7
```
<br />
## String functions:
```java
// pick off a single character
String firstName = "Mandy";
System.out.print("First initial: " + firstName.charAt(0));

// pick off everything EXCEPT first character
String sillyName = firstName.substring(1);

// replace a string of characters
String secondVerse = "Banana-fana fo-f(Name)!";
System.out.println(secondVerse.replace("(Name)",sillyName));
```
