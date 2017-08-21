---
title:  "File I-O Sample"
id: "file-io-sample"
date:   2017-08-20 18:00:00
categories: edu snhu it145
---

# Overview
While there are many examples of file input/output in Java, they tend to only show snippets of code which can hide the big picture. This sample is a full Java console application that showcases several techniques including using buffered I/O to read lines, character at-a-time I/O, building a file path using the current location where the program is running as well as using object-oriented inheritance to implement the file logic.

# Pseudocode
This sample displays a simple menu on the console, waits for the user to select an option and then perform the requested operation.
```
CLASS FileSample
  PERFORM ShowMenu
  IF option chosen is character I/O
  ELSE IF option chosen is buffered I/O
  ELSE IF option chosen is exit
  END IF

  METHOD ShowMenu
    DISPLAY Read with character I/O
    DISPLAY Read with buffered I/O
    DISPLAY Exit
    OBTAIN user option
  END METHOD
END CLASS
```