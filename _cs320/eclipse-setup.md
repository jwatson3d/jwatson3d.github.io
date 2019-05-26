---
title:  "Eclipse Setup"
id: "eclipse-setup"
date:   2019-05-25 15:00:00
categories: edu snhu cs320
---
{% include galheader.html %}
Contents
* TOC
{:toc}
<hr/>

# Import Project
Eclipse is one of the two most widely used IDEs today...and it's free! Since IDEs are powerful tools they can also be complicated to master, especially when just starting out using one.  When first opening Eclipse you are faced with a blank screen after you close the "Welcome to Eclipse" tab. The first thing you need to do is import the project that you downloaded and uncompressed (or unzipped).

### Step 1
Right-click anywhere in the Package Explorer tool window area on the left and choose "Import..."
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/1_eclipse_import_project.png" title="Import Project">

### Step 2
On the Import dialog, choose "Existing Maven Projects":
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/2_eclipse_maven_wizard.png" title="Existing Maven Projects">

### Step 3
On the Import Maven Projects dialog, click "Browse" and select the folder containing the uncompressed source project:
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/3_eclipse_maven_import.png" title="Select Project">

### Step 4
After clicking Finish you'll be returned to the Eclipse main window with the Package Explorer now containing the project you just imported:
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/4_eclipse_package_explorer.png" title="Package Explorer">
<br />Be sure to open and work in the *package* folders near the top of the tree and not the source ("src") folder near the bottom!<br /><br />
Notice that the Java Library version is 1.5 - this is the default version that Eclipse starts with.

# Fix Library References
The red 'X' indicators are showing because the source code uses language features that require at least Java 1.8 and also references JUnit features. To correct this, you must update the project properties:

### Step 5
Right-click on the project name at the top of the tree and choose "Properties":
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/5_eclipse_package_properties.png" title="Project Properties">

### Step 6
Make sure "Java Build Path" is selected on the left and then click the "Libraries" tab. Notice that the referenced libraries in the list is wrong or incomplete. Click the "Add Library" button:
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/6_eclipse_java_build_path.png" title="Java Build Path">

### Step 7
Choose "JRE System Library" and then click "Next":
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/7_eclipse_add_library.png" title="Add Library">

### Step 8
Choose the "Workspace default JRE" which should be Java 1.8 if you've installed the Java SDK correctly on your machine.
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/8_eclipse_add_jre.png" title="Add Java 1.8">

### Step 9
Now repeat the process to add JUnit if it is not already in the list of referenced libraries. When choosing JUnit, be sure to choose JUnit 4:
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/9_eclipse_add_junit.png" title="Add JUnit">

### Step 10
Now, select the "Java Compiler" category on the left and ensure the "Compiler Compliance Level" is set to 1.8:
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/10_eclipse-java-compiler.png" title="Java Compiler Version">

### Step 11
Finally, all the red 'X' indicators are gone because the project is now referencing the correct Java version and JUnit.
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/11_eclipse_after_properties.png" title="Setup Complete">

# Run Unit Tests
### Step 12
Now you can right-click on the entire testing package or even a single test class and then choose "Run As" followed by "JUnit Test"
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/12_eclipse_runas_junit.png" title="Run JUnit">

### Step 13
Everything is set up correctly when you see results such as this:
<br /><img src="http://blog.pragmatictech.guru/img/eclipse-setup/13_eclipse_junit_results.png" title="JUnit Results">
