---
title:  "File Input Sample"
id: "file-sample"
date:   2017-08-20 18:00:00
categories: edu snhu it145
imgfolder: /img/file-io-sample
images:
  - name: fileio-class-diagram.png
    thumb: fileio-class-diagram_tn.jpg
    text: Program Input
    width: 256
    height: 192
---
{% include galheader.html %}
Contents
* TOC
{:toc}
<hr/>

# Overview
While there are many examples of file input in Java, they tend to only show snippets of code which can hide the big picture. This sample is a full Java console application that showcases several techniques including:

1. Creating a menu and prompting the user for a choice
2. Creating and using separate classes to manage the file logic
3. Using character input to read a single character at a time
4. Using buffered input to read an entire line of text at a time
5. Using a scanner to read an entire line of text at a time
6. Splitting a text line into an array of strings (a.k.a. "parsing")
7. Building a file path using the current location where the program is running.

The key takeaway can been quickly seen by comparing the `readFile()` methods of the two classes. In one sense, everything else is "fluff" - creating a menu, prompting and validating for input, determining the correct path to the sample file, opening the files and preparing the variables. The meat of these two classes resides in the read logic.

# Source Code
Source code used in this article can be downloaded here: [FileSample.zip](/src/it145/FileSample.zip).<br />Both NetBeans and IntelliJ project files are included so you can easily open, compile, debug and step through the code to help you analyze and understand what it is doing. Neither IDE is required to view and compile this sample - a text editor program such as NotePad++, Atom, Sublime Text, or BBEdit can be used as well.

# Sample Data
I used the website [Mockaroo](https://www.mockaroo.com/) to generate ten random records to be used for this sample:
```
id,first_name,last_name,email,gender,ip_address
1,Angelique,Presho,apresho0@ovh.net,Female,80.215.23.84
2,Gene,Grosier,ggrosier1@blogtalkradio.com,Male,117.97.127.246
3,Joannes,Fouracre,jfouracre2@cloudflare.com,Female,221.252.59.245
4,Irvin,Beaby,ibeaby3@zdnet.com,Male,104.33.100.103
5,Marven,Skirvane,mskirvane4@berkeley.edu,Male,112.220.37.191
6,Ailyn,Lewnden,alewnden5@aol.com,Female,80.28.104.142
7,Heidi,Cominoli,hcominoli6@si.edu,Female,195.130.205.225
8,Prisca,Humphris,phumphris7@mtv.com,Female,147.45.117.243
9,Margery,Lorence,mlorence8@goo.gl,Female,141.252.17.247
10,Cleon,Camillo,ccamillo9@sciencedaily.com,Male,101.182.4.109
```

Notice that each line of the text file represents a single "record" of related information for a ficticious person. The lines contain commas to separate the individual fields and the first line contains the field names or column headings if you think of it in spreahsheet terms. This formatting with the file is what is known as comma-separated values or CSV.

# Pseudocode
This file sample application displays a simple menu on the console, waits for the user to select an option and then performs the requested operation.
```
CLASS FileSample
    LOOP until exit requested
        PERFORM ShowMenu
        IF option chosen is character input
            PERFORM CharacterInput.ReadFile
        ELSE IF option chosen is buffered input
            PERFORM BufferedInput.ReadFile
        ELSE IF option chosen is scanner input
            PERFORM ScannerInput.ReadFile
        ELSE IF option chosen is exit
            EXIT loop 
        END IF
    END LOOP

    METHOD ShowMenu
        LOOP until valid option chosen
            DISPLAY Read with character input
            DISPLAY Read with buffered input
            DISPLAY Read with scanner input
            DISPLAY Exit
            OBTAIN user option
        END LOOP
    END METHOD
END CLASS

CLASS BufferedInput
    METHOD ReadFile
        OPEN file
        LOOP until end of file reached
            READ a line of text from file
            SPLIT the line into fields
            DISPLAY fields in column format
        END LOOP
        CLOSE file
    END METHOD
END CLASS

CLASS CharacterInput
    METHOD ReadFile
        OPEN file
        SET fieldNumber to zero for first field in a line
        LOOP until end of file reached
            READ a character from file
            IF character is newline
                DISPLAY fields in column format
                SET fieldNumber to zero for first field in a line
            ELSE IF character is carriage return
                ignore and loop again
            ELSE IF character is a comma
                INCREMENT fieldNumber to next field
            ELSE
                APPEND character to current field
            END IF
        END LOOP
        CLOSE file
    END METHOD
END CLASS

CLASS ScannerInput
    METHOD ReadFile
        OPEN file
        LOOP until end of file reached
            READ a line of text from file
            SPLIT the line into fields
            DISPLAY fields in column format
        END LOOP
        CLOSE file
    END METHOD
END CLASS

```

There are four classes involved - the main console application which is `FileSample`, a class to handle buffered input called `BufferedInput`, a class to handle character input called `CharacterInput` and a class to handle scanner input called `ScannerInput`. All three of the `xxxInput` classes have a method called `ReadFile` containing the logic necessary to read and display a text file. Even from just this high-level pseudocode you can see that using the buffered input approach is much simpler from a programmer's point of view - read a line, split that line into fields and print them. That's a whopping three lines of effort. Compare that to character input where each character is read one-at-a-time and appended to a string variable, when a comma is reached (or whatever delimiter is used in the file) then a field number variable is incremented so that you are building up the correct field. This lower-level type of reading requires ten lines of effort using character input to accomplish the same thing that three lines of buffered input can do. The scanner input is essentially identical to the buffered input and is shown mostly for reference purposes.

# Java Code
## FileSample
Here is the `FileSample` class for the main concole application:
```java
import static java.lang.System.out;
import java.util.Scanner;

/*
 * File Input/Output example
 *
 * IT-145 Foundations of Application Development
 *
 * College of Online and Continuing Education
 * Southern New Hampshire University
 *
 * @author John Watson <john.watson@snhu.edu>
 *
 * Compile command:
 *   > javac FileSample.java
 *
 * Run command:
 *   > java -cp . FileSample
 *
 */
public class FileSample {
    
    // name of the sample file
    static String filename = "sample.csv";

    /**
     * The one and only main() method is our starting point
     * 
     * @param args 
     */
    public static void main(String[] args) {
        boolean exit = false;
        
        // main loop runs until exit requested
        while (!exit) {
            int option = showMenu();
            switch (option) {
                case 1:
                    CharacterInput characterInput = new CharacterInput(filename);
                    characterInput.readFile();
                    break;
                case 2:
                    BufferedInput bufferedInput = new BufferedInput(filename);
                    bufferedInnput.readFile();
                    break;
                case 3:
                    ScannerInput bcannerInput = new ScannerInput(filename);
                    scannerInnput.readFile();
                    break;
                case 9:
                    exit = true;
                    out.print("Good bye!");
                    break;
            }
        }
    }
    
    /**
     * Display menu until a valid choice is input.
     * 
     * @return the menu choice
     */
    private static int showMenu() {
        Scanner consoleIn = new Scanner(System.in);
        boolean valid = false;
        int choice = 9;
        
        while (!valid) {
            // display menu
            out.println();
            out.println("1. Read using character-at-a-time");
            out.println("2. Read using buffered input");
            out.println("3. Read using scanner input");
            out.println("9. Exit");
            out.println();
            out.print("Option: ");
            
            // obtain user's choice
            choice = consoleIn.nextInt();
            
            // simple switch to find any valid choice
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 9:
                    valid = true;
                    break;
                default:
                    out.println();
                    out.println(String.format("Oops! '%s' is not an appropriate choice.", choice));
                    break;
            }
        }
        
        return choice;
    }
}
```
You'll notice that the actual programming code is very similar to the pseudocode shown previously. The loops were implemented using `while` and the conditionals were implemented using a `switch` statement which is arguably cleaner and easier to follow syntax compared to a series of `if-else`.

## BufferedInput
The elegance of the psuedocode can mask some of the gory, low-level details that a program needs to do. For example, in order to work with files a program needs to use at least two different `java.io` classes. The [File](http://docs.oracle.com/javase/8/docs/api/java/io/File.html) class makes available to a program all the attributes of a file (full pathname or directory path, read only, hidden, permissions, etc.). File access within Java begins with the `File` class since the other file-related classes were written to accept a `File` instance variable in their constructors so they will have information about the file you're intending to work with. [FileReader](http://docs.oracle.com/javase/8/docs/api/java/io/FileReader.html) is one such class, containing various methods for reading files and taking a `File` instance variable in its constructor.

### prepareFile()

I created the `prepareFile()` method to keep the setup logic together and designed it to return a boolean value indicating whether or not the setup was successful, i.e. the file is ready to be read. The credit for this logic belongs to [Joel Westberg's answer](http://stackoverflow.com/a/10830715) posted on StackOverflow.

```java
/**
 * Prepares a File instance using the supplied filename
 *
 * @return 'true' if the file is prepared for use
 */
private boolean prepareFile() {

    // Determine the correct path location for the file
    // see: http://stackoverflow.com/a/10830715
    URL path = BufferedIO.class.getResource(filename);
    if (path == null) {
        err.format("File not found!! Unable to continue.\n%s", filename);
        return false;
    }

    // try to create a File instance using the calculated path
    try {
        file = new File(path.toURI());
    } catch (URISyntaxException ex) {
        err.format("IOException: %s%n", ex);
        return false;
    }

    return true;
}
```


There are two separate tasks that the method accomplishes:

1. Obtain the full path where the file is located by using the built-in `getResource()` method Java provides to every class. It returns the full path and filename using the current directory wherever the Java class was loaded and run from. This allows the sample file to be found no matter where the program is located on your computer. An added benefit is that this technique is cross-platform aware - the same code works correctly on a Windows or Unix (including Linux and Mac OS) file system.
2. Construct an instance of the `File` class by passing the string containing the full path of the sample file just determined in step #1.

The file path calculation in step #1 will not work if the file is not located in the same directory as the Java class file. When this happens, the `getResource()` method will return `null`. To guard against this, the variable `path` is tested for a null value and, if so, a descriptive error message is shown then the `prepareFile()` method immediately returns `false` indicating that the File classes were not successfully set up.

The next action (creating a `File` instance) causes the program to attempt to access the file on the hard drive which leads to the possibility of errors, more formally known as exceptions, so they are contained within `try-catch` blocks. Doing so allows a meaningful error message to be displayed and the `prepareFile()` method can immediatly return `false`. The `try-catch` technique avoids the program crashing and displaying an ugly stack-trace message that users would not be expected to make sense of.

### readFile()
The `readFile()` method most closely mimics the pseudocode which is not uncommon. When programmers think of the logic needed to handle a task, such as reading and processing data from a file, they focus on those specific steps while glossing over all the other details necessary. As this program shows, the "guts" of the read logic are almost trivial and uninteresting once all the preparations are made - obtaining the correct path to the file, verifying that the file exists, preparing the `File` class as well as the `FileReader` class.

```java
/**
 * Reads the selected file and prints the contents
 */
public void readFile() {

    // define a String to hold each line read from file
    String line;

    // if able to open the file
    if (prepareFile()) {

        try {

            // open the file and position to the start
            FileReader fileReader = new FileReader(file);

            // Always wrap FileReader in BufferedReader to improve throughput.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // now loop and print each remaining line
            while ((line = bufferedReader.readLine()) != null) {
                fields = line.split(",");
                out.println(String.format(format, fields[0], fields[1], fields[2], fields[3]));
            }

            // always close the file
            bufferedReader.close();

        } catch (FileNotFoundException ex) {
            err.format("FileNotFoundException: %s%n", ex);
        } catch (IOException ex) {
            err.format("IOException: %s%n", ex);
        }
    }
}
```

## CharacterInput
Essentially the `CharacterInput` class is identical to the `BufferedInput` above with the difference of the `readFile()` method.

### prepareFile()
The `prepareFile()` method is identical to the one already shown in `BufferedInput`.

### readFile()
The `readFile()` method also mimics the pseudocode. As each character is read from the file a `switch` statement is used to determine what to do with it. The bottom of the switch has the default behavior which is to append the character to a string variable. Since there are six columns in the sample file there needs to be six string variables. Rather than trying to manage one variable per column this is a perfect situation to use an *array of strings* so there's only one variable name to manage. However, now we need a numeric index variable to hold the current index value within the array that we're working with.

The remainder of the `switch` statement handles the two other important conditons - comma and end-of-line. When a comma is read we've reached the separator between fields so all that's necessary is to increment the `fieldNum` variable to point to the next field or element in the array of fields. When an end of line is read we can print out the array of fields that has been built up then re-initialize the array to empty and the `fieldNum` to zero in preparation to start all over again with the next line. Phew!

```java
/**
 * Reads the selected file and prints the contents
 */
public void readFile() {

    // if able to open the file
    if (prepareFile()) {

        try {
            int input;
            char ch;
            
            int fieldNum = 0;

            // initialize String array elements
            fields = new String[]{"","","","","",""};

            // open the file and position to the start
            FileReader fileReader = new FileReader(file);

            // keep reading characters until end-of-file
            // @see http://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html#read--
            while ((input = fileReader.read()) != -1) {
                // cast integer value into a character
                ch = (char) input;

                // now figure out what to do with the character just read
                switch (ch) {

                    // newline character - reached end of a line
                    case '\n':
                        // print out the fields previously read
                        out.println(String.format(format, fields[0], fields[1], fields[2], fields[3]));
                        // initialize String array elements
                        fields = new String[]{"","","","","",""};
                        // reset field number back to zero (first element)
                        fieldNum = 0;
                        break;

                        // return character - ignore (Windows-style encoding)
                    case '\r':
                        break;
                        
                    // comma reached so increment field number
                    case ',':
                        fieldNum++;
                        break;

                    // append character to current field
                    default:
                        fields[fieldNum] += ch;
                }
            }

            // always close the file
            fileReader.close();

        } catch (FileNotFoundException ex) {
            err.format("FileNotFoundException: %s%n", ex);
        } catch (IOException ex) {
            err.format("IOException: %s%n", ex);
        }
    }
}
```