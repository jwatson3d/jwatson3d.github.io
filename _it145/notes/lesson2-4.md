---
layout: post
title:  "Lesson 2-4 Pseudocode"
date:   2018-01-01 18:00:00
categories: edu snhu it145
---
## Overview
[Pseudocode](https://www.wikihow.com/Write-Pseudocode) is a loosely structured way of organizing the steps and logic that program code needs to follow in order to accomplish its goals. From a composition perspective, pseudocode lies somewhere between plain English prose (such as an essay) and actual program source code yet it should be neither of these two extremes. Within the steps and logic of your pseudocode you will form the [algorithm](https://techterms.com/definition/algorithm) for how to solve a problem using program source code.

## Rules

1. **Authors** of pseudocode are:
    1. Programmers who wish to organize their thoughts before starting to code
    2. Analysts who wish to communicate to programmers what a program needs to do
2. The **audience** are programmers who will implement (write) the program. This is an important point, since programmers will read pseudocode there is an implicit knowledge of programming and programming terms assumed.
3. The **perspective** is from the program's point of view - what the program needs to do - not from the person sitting at the computer. It is NOT notes to yourself or me of what YOU need to do but rather is the STEPS the PROGRAM must take to produce the desired result.
4. The **language** of pseudocode is:
    1. English words and phrases, not necessarily complete sentences and definitely not prose!
    2. Not program source code!
    3. Programming language-neutral - pseudocode should be generic enough to allow implementation of the steps using any programming language (Java, Python, C++, Ruby, etc.)
    4. Capitalized keywords that are usually action verbs along with enough information to convey the intent of the action.
5. Common **keywords**:
    1. Input - INPUT, READ, OBTAIN, GET
    2. Output - DISPLAY, PRINT, SHOW
    3. Computation - COMPUTE, CALCULATE, DETERMINE
    4. Initialization - SET, LET, ASSIGN
    5. Conditionals - IF, THEN, ELSE, END-IF, SWITCH, CASE
    6. Loops - FOR, WHILE, LOOP, UNTIL, END-FOR/WHILE/LOOP
    7. Avoid import statements, package statements, variable declaration statements, etc. are language-specific constructs that the programmer already knows how to do using their chosen programming language.
6. Sufficient **detail** provided:
    1. Calculations should be spelled out so that everyone understands the formula/math to follow and there's no misunderstanding
    2. CALCULATE grades would be example of too vague - spell out the calculation and/or steps how to calculate the grades
    3. READ credentials, VALIDATE user - both examples of being vague. Where are the credentials read from? Is there a loop involved with conditionals to test if the username entered matches? How do you validate?

## Examples

#### BAD:
```
  Turn on computer
  Navigate to project folder
  Write program
```
Rule 2: programmers implicitly know how to do this<br/>
Rule 3: perspective of human (what a person needs to do), not what a program needs to do<br/>
Rule 5: no common keywords<br/>

#### BAD:
```
  function doProgrammingHomework():
    getComputer();
    openBlackboard();
    for (var count = 0; count < problems.length(); count++)
        solve()
        while (!compile)
            debug();
        submit();
    shutDownComputer();
```
Rule 3: perspective of human (what a person needs to do), not what a program needs to do<br/>
Rule 4b: for statement is pure program source code, not pseudocode<br/>
Rule 6: solve() is too vague - solve what? how will it be solved? what steps are needed to solve it?<br/>

#### GOOD:
```
  DISPLAY "How many apples are on hand?"
  INPUT applesOnHand
  CALCULATE applesToOrder = applesToStock - applesOnHand
  IF applesToOrder less than zero
     DISPLAY "No need to order"
  END IF
```
Rule 2: Programmer understands what logic needs to be coded.<br/>
Rule 3: Perspective is what the program steps are, not what a person does.<br/>
Rule 4: Not programming language-specific.<br/>
Rule 5: Keywords are capitalized action verbs.<br/>
Rule 6: Calculations spelled out, notice indication of variables by meaningful names (yet no datatypes mentioned, no DECLARE or DEFINE statements, etc.)<br/>

### GOOD
```
  METHOD ShowMenu
     LOOP until valid option chosen
        DISPLAY Read with character input
        DISPLAY Read with buffered input
        DISPLAY Read with scanner input
        DISPLAY Exit
        OBTAIN user option
     END LOOP
  END METHOD
```
Rule 2: Programmer understands what logic needs to be coded.<br/>
Rule 3: Perspective is what the program steps are.<br/>
Rule 4: Not programming language-specific.<br/>
Rule 5: Keywords are capitalized action verbs.<br/>

## Additional Resources
I **strongly** encourage you to review these resources to further understand and appreciate what constitutes good pseudocode:

* [IT-145 Guide to Pseudocode](http://snhu-media.snhu.edu/files/course_repository/undergraduate/it/it145/it145_guide_to_pseudocode.pdf)
* [Introduction to Pseudocode](https://www.slideshare.net/DamianGordon1/pseudocode-10373156)
* [How to Write Pseudocode](http://www.wikihow.com/Write-Pseudocode)
* Dr. John Dalbey's [Pseudocode Standard](http://users.csc.calpoly.edu/~jdalbey/SWE/pdl_std.html)
* Dr. Tim Bell's [Pseudocode Tutorial and Exercises](http://www.cosc.canterbury.ac.nz/tim.bell/dt/Tutorial_Pseudocode.pdf)
* Dr. Robert F. Roggio's [Pseudocode Examples](http://www.unf.edu/~broggio/cop2221/2221pseu.htm)

[<< Return to Index]({{ site.baseurl }}{% link _it145/notes/lesson2.md %})<br /><br/>
<span><small>&copy; {{ site.time | date: '%Y' }} <a href="/about" class="black">{{ site.author }}</a></small></span>

  