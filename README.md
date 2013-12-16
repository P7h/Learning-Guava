# Learning Guava
----------

## Introduction
Guava follows almost all the excellent patterns and practices mentioned in [Effective Java](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683) written by [Joshua Bloch](https://plus.google.com/113200173329286634669/about), who has designed the impeccable Java Collections API while he was at Sun. Later he joined Google. And under his mentor-ship, Google Guava got wings and became even well designed and effective API, useful for many situations and scenarios with an ever-growing feature list.

I have been using [Google Guava](https://code.google.com/p/guava-libraries/) since more than 3 years now. I use Guava for the various design patterns they implemented and the excellent thought process behind this wonderful library.<br>
I ensure I add Guava dependency as the first thing to my Gradle or Maven build script for any new project. Guava makes Java code a lot more readable, clean, simple and elegant. Guava utilizes the Java generics very well.<br>

Guava also helps to reduce the clutter / boiler-plate in the Java code.
Consider the following snippet of Map definition syntax between `Java 6` and `Guava`:<br>
`Map<String, List<String>> map = new HashMap<String, List<String>>();`<br>
vs.<br> 
 `Map<String, List<String>> map = Maps.newHashMap();`

With `Java 7`, we could at least write bit legible syntax for the above same definition.<br>
`Map<String, List<String>> map = new HashMap<>();`<br>

But even then it is not as elegant as Guava's version. There are many such advantages of using Guava in your Java plain or Web Project.

## Features
This repo will contain source code and snippets which I have been using since sometime. I will be coming up some scenarios and take up each utility class in Guava and write some test cases for the same which demonstrates the key features of some of the classes of the Library.<br>
This project was developed in IntelliJ IDEA.

1. [Splitter](src/test/java/org/p7h/learningguava/strings/SplitterTest.java)
2. Joiner

Feel free to check out and run some tests to get to know and also appreciate Guava for its simplicity, elegance and power. 

## Dependencies
* Google Guava v15.0.0
* Joda-Time v2.3
* JUnit v4.11

Also, please check [`build.gradle`](build.gradle) for any information on the various other dependencies of the project.<br>

## Requirements
This project uses Maven to build and run the topology.<br>
You need the following on your machine:

* Oracle JDK >= 1.7.x
* Gradle >= 1.9
* Clone this repo and import as an existing Maven project to either Eclipse IDE or IntelliJ IDEA.

Rest of the required frameworks and libraries [if any] are downloaded by Gradle as required in the build process, the first time the Gradle build is invoked.

## Usage
To build and run all the test cases, you must use Java 1.7.<br>

    gradle --no-color clean test

After the run is complete navigate to [Test case Report](build/reports/tests/index.html) to see the Test Summary of the run.<br>

## Problems
If you find any issues, please report them either raising an [issue](https://github.com/P7h/Learning-Guava/issues) here on GitHub or alert me on my Twitter handle [@P7h](http://twitter.com/P7h). Or even better, please send a [pull request](https://github.com/P7h/Learning-Guava/pulls).<br>
Appreciate your help. Thanks!

## License
Copyright &copy; 2013 Prashanth Babu.<br>
Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
