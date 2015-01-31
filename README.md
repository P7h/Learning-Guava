# Learning Guava
----------

## Introduction
[Google Guava](https://code.google.com/p/guava-libraries/) is a project which contains several core libraries that Google relies on in their Java-based projects like collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, etc. Guava is used by many applications / frameworks. Just to highlight Guava's usage, it is used extensively even in [Apache Hadoop](http://hadoop.apache.org) and various Hadoop Ecosystem projects, [Apache Storm](http://storm.apache.org), [Apache Spark](http://spark.apache.org), etc to name a few.

Guava follows almost all the excellent patterns and practices mentioned in [Effective Java](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683) written by [Joshua Bloch](https://plus.google.com/113200173329286634669/about), who has designed the wonderful Java Collections API while he was at Sun. Later he joined Google. And under his mentor-ship, Google Guava got wings and became even more well designed and effective API, useful for many situations and scenarios with an ever-growing feature list.

I have been using Guava since more than 4 years now. I really like Guava for the various design patterns they implemented and the excellent thought process behind this wonderful library.<br>
I ensure I add Guava dependency as the first thing to my Gradle or Maven build script for any new project. Guava makes Java code a lot more readable, clean, simple and elegant. Guava utilizes the Java generics very well.<br>

Guava also helps to reduce the clutter / boiler-plate in the Java code.<br>
Consider the following snippet of Map definition syntax between `Java 6` and `Guava`:<br>
`Map<String, List<String>> map = new HashMap<String, List<String>>();`<br>
vs.<br> 
 `Map<String, List<String>> map = Maps.newHashMap();`

With `Java 7`, we could at least write bit legible syntax for the above same definition.<br>
`Map<String, List<String>> map = new HashMap<>();`<br>

But even then it is not as elegant as Guava's version. There are many such advantages of using Guava in your Java plain or Web Project.

## Features
This repo contains source code and snippets which I will be developing to showcase various features and strong points of Guava. I will be coming up some scenarios and take up each utility class in Guava and write some test cases for these, which demonstrates the key features of some of the classes of this library.<br>
This project was developed in [IntelliJ IDEA](http://www.jetbrains.com/idea). But can be imported in [Eclipse IDE](http://www.eclipse.org) as well.

Following are the classes I have developed till now.<br>

1. [SplitterTest](src/test/java/org/p7h/learningguava/strings/SplitterTest.java)
1. [JoinerTest](src/test/java/org/p7h/learningguava/strings/JoinerTest.java)
1. [BimapTest](src/test/java/org/p7h/learningguava/collections/BiMapTest.java)

Please feel free to check out the source code and run some tests to get to know and also appreciate Guava for its simplicity, elegance and power. 

## Dependencies
* Google Guava v18.0
* Joda-Time v2.6
* JUnit v4.12

Also, please check [`build.gradle`](build.gradle) for any information on the various other dependencies of the project.<br>

## Requirements
This project uses [Gradle](http://gradle.org) to build and execute the code.<br>
You need the following on your machine:

* Oracle JDK >= 1.8.x
* Gradle >= 2.2.1
* Clone this repo and import as an existing Gradle project to either Eclipse IDE or IntelliJ IDEA.

Rest of the required frameworks and libraries [if any] are downloaded by Gradle as required in the build process, the first time the Gradle build is invoked.

## Usage
To build and run the test cases, you must use Java 1.8.<br>

Command to execute all the test cases is:

    gradle --no-color

Command to execute a single test case is [in this case, consider the class to be tested is [SplitterTest](src/test/java/org/p7h/learningguava/strings/SplitterTest.java)]:

    gradle --no-color clean test -Dtest.single=Splitter

After the run is complete, [JUnit Test case Report](build/reports/tests/index.html) would get been created in `build/reports/tests/index.html`.<br>
Open this file in a browser to see the Test Summary of this particular run.<br>

## Problems
If you come across any issues, please report them either raising an [issue](https://github.com/P7h/Learning-Guava/issues) here on GitHub or alert me on Twitter [@P7h](http://twitter.com/P7h). Or even better, please send a [pull request](https://github.com/P7h/Learning-Guava/pulls).<br>
Appreciate your help. Thanks!

## License
Copyright &copy; 2013-2015 Prashanth Babu.<br>
Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).