
About
------

This is our submission for the [FooBarQix contest]

Building and running
--------------------

### Building ###

The [Maven] tool is required to build the project.

From the project root directory, run the following command:

		$ mvn package

This should create a JAR in the `target` directory.

A prebuilt JAR is already present in the `prebuilt` directory for your convenience.

### Running ###

From the project root directory, run the following command:

		$ java -jar prebuilt/FooBarQix-bznmith-1.0.jar

If you want to use a freshly built JAR, the command is:

		$ java -jar target/FooBarQix-bznmith-1.0.jar

Finally you can also use Maven:

		$ mvn exec:java

### Testing ###

In order to run the included unit tests, run:

		$ mvn test


  [FooBarQix contest]: http://www.code-story.net/2011/11/16/foobarqix.html
  [Maven]: http://maven.apache.org/