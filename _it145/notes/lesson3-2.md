---
layout: post
title:  "Lesson 3-2 String Operations"
date:   2018-01-01 18:00:00
categories: edu snhu it145
---
## Comparisons

Remember that Strings are complex data types, also called objects, in Java. The "under the covers" internal representation and mechanics of objects are too advanced to cover in an introductory course; however, we can begin using classes without knowing all the details. In fact, you've already learned about and used the Scanner class and its methods (`nextInt()`, `nextDouble()`, etc.). In the same manner, the String class has methods that are used for comparisons and here's a few of the commonly used ones:

| **Method** | &nbsp; | **Result** |
| --- | --- |
| strA.equals(strB) | &nbsp; | true if every character of strA equals every character of strB |
| &nbsp; | &nbsp; | &nbsp; |
| strA.compareTo(strB) < 0 | &nbsp; | returns position of the first non-equal character of strA is less than the corresponding character in strB |
| &nbsp; | &nbsp; | &nbsp; |
| strA.compareTo(strB) == 0 | &nbsp; | true if every character of strA equals every character of strB|
| &nbsp; | &nbsp; | &nbsp; |
| strA.compareTo(strB) > 0 | &nbsp; | returns position of the first non-equal character of strA is greater than the corresponding character in strB
 |

Java is a case-sensitive language meaning uppercase "J" and lowercase "j" are not the same character. For convenience, both comparison methods above have companion methods that ignore the case of characters - **.equalsIgnoreCase()** and **.compareToIgnoreCase()**. These are "convenience" methods that help when testing value such as user input. Imagine if you prompt the user to type Y or N...what if they don't use the shift key and type lowercase "y" or "n". Writing `if (userInput.equals("Y"))` because that is what you expected will fail if they type a lowercase "y". However, writing `if (userInput.equalsIgnoreCase("Y"))` will work.

[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson3.md %})<br />
<br/>
<span><small>&copy; {{ site.time | date: '%Y' }} <a href="/about" class="black">{{ site.author }}</a></small></span>