---
layout: post
title:  "FAQs"
date:   2017-04-22 21:00:00
categories: edu snhu it145
---

* TOC
{:toc}
<hr/>
# I have completed work in zyBooks (participation, lab activities) and there’s grades shown in zyBooks but when I log into Blackboard to view the Grade Center I do not see the grades posted there.
> zyBooks is a separate learning resource that is not currently integrated with Blackboard. Typically, I wait until the module/week is over before I pull reports from zyBooks and manually post grades to Blackboard. I don’t do this throughout the week because it is a manual process and there’s no way for me to see what is changed/updated since the last time I run activity reports - they are a snapshot in time as of when they are run.
<hr/>

# I had some difficulty _[insert reason here]_ and I just now finished a zyBooks assignment but my grades still aren't updated in Blackboard.
> Once a week is over and I have pulled the activity reports for that week I don't keep going back to earlier weeks to see if something has changed or work as been completed late. If you wish to have your late work reviewed, you must email me and specify which assignments you'd like me to go back and look at.
<hr/>

# When I run a program in zyBooks I keep getting `EOFError: EOF when reading a line`.
> Most likely the program you are attempting to run is expecting or prompting for some value to be input. If so, did you type the input values into the text box titled “Enter program input (optional)” right beneath the “RUN PROGRAM” button _**before**_ you clicked “RUN PROGRAM”?<br/><br/>
Web pages aren’t interactive like a program running on your computer. Instead, they use what is called a "request-response" model for interaction. That is, when you click a button on a web page the web page and anything you typed (in our case the program you are trying to run) is sent to the zyBooks server to be processed - the "request". This means the program you are typing in is actually run on the zyBooks server and the output from that is then sent back to your web browser - the "response". This is why the zyBooks page has a separate text box for you to supply the input values that will be used when running the program - those values are also sent to the zyBooks web server along with your program source code that you typed in and  together that information is used to run the program.<br/><br/>
Now might be a good time to review [Introduction to zyBooks](/it145/intro-to-zybooks/)
<hr/>

# I still am getting errors even though I can see the output right there.
> It's probably a minor typo however remember that computers are very binary - ones and zeros, black and white, no gray areas. Either the output matches perfectly or it doesn't. Look for any yellow highlights in the output area. Each highlight box marks the exact spot of a problem - check your spacing and remember that "whitespace" counts. If you see a little bent arrow pointing down to the left it means there is a problem with your linefeeds. Did you use `println()` instead of `print()` or vice-versa? You'll have to compare `Your output` to the `Expected output` right below and then change your code so your output exactly matches what is expected.
<hr/>

# When I upload my program to zyBooks lab activity then submit it I keep getting `Exception in thread "main" java.lang.NoClassDefFoundError: PaintEstimator (wrong name: paintestimator/PaintEstimator) at java.lang.ClassLoader.defineClass1`
> 1. Your class name inside the source code is not what zyBooks expects, e.g. `public class PaintEstimator`
> 2. Your source code includes a package statement near the top, e.g.<br/>
>  `package paintestimator;` Delete or comment out the package statement, save and then re-upload to zyBooks. While you haven't learned this yet, including a package name in Java changes the full name of a class, e.g. from `PaintEstimator` to `paintestimater/PaintEstimator` which zyBooks cannot handle. You can also avoid this by deleting the default package name in the NetBeans wizard and just specify the class name you wish.<br/><br/>
Now might be a good time to review [NetBeans Quick Start](/it145/netbeans-quick-start/)

<hr/>

# How can I read a file located in the current directory?
> This StackOverflow post shows how to obtain the fully qualified path to a file located in the same directory as the compiled classes, even if you move the project to another directory on the same or another computer. Note that this technique even works cross-platform between Windows and Linux/MacOS...<br /><br />[Java, reading a file from current directory?](http://stackoverflow.com/a/10830715)
> ```
> URL path = YourClassNameHere.class.getResource(filename);
> File file = new File(path.toURI());
> 
> // FileReader reads text files in the default encoding.
> FileReader fileReader = new FileReader(file);
> 
> // Always wrap FileReader in BufferedReader to improve throughput.
> BufferedReader bufferedReader = new BufferedReader(fileReader);
> ```
> Of course, _**YourClassNameHere**_ should be replaced with the name of your Java class that this code is placed in.
<hr/>

# How can I read and process the lines of a text file?
> This tutorial covers the basics of reading text files...[Reading and Writing Files in Java](https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html)<br />The essence of the technique is this:<br />
> ```
> while((line = bufferedReader.readLine()) != null) {
>    System.out.println(line);
> }
> ```
> Notice that the `while` statement is doing "double-duty". The inner statement `line = bufferedReader.readLine()` is using the buffered reader class to read a line from the text file and store it in the string variable `line`. When there are no more lines to be read then the result will be `null` making the while condition false and the loop exits.
<hr/>

# Can I use `print` statements in my code to help with debugging?
>Yes, and you can leave the `print` statements in but commented out in the final version. Using `print` is a well-tried technique that has survived the (technological) ages. The more modern approach is to use the IDE's interactive debugging to step through the code line by line while being able to examine all variables available at that moment, in real time. The `print` approach requires you to examine the code, try to guess where the problem might be, add some `print` statements for variables that might have a clue then rinse and repeat over and over. With a little practice using the debugger, you can usually find and fix problems within one or two passes. It might be a good exercise/challenge to help you grow your skills to try it out.

>A quick Google search for "netbeans debugger" turns up four links right near the top of the results:
> 1. [NetBeans Debugger and Profiler](https://netbeans.org/features/java/debugger.html)
> 2. [Using the Visual Debugger in NetBeans IDE](https://netbeans.org/kb/docs/java/debug-visual.html)
> 3. [Debugging Java Applications](https://netbeans.org/project_downloads/usersguide/nbfieldguide/Chapter5-Debugging.pdf) (from the NetBeans User Guide)
> 4. [Video of using the Visual Debugger in the NetBeans IDE](https://netbeans.org/kb/docs/java/debug-visual-screencast.html)

>I'm sure there are dozens of videos on YouTube although I'd suggest looking for ones where the speaker uses reasonably understandable English diction - some are incredibly difficult to follow.
