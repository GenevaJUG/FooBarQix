#!/bin/bash

# Building app
echo "Building the app (redirecting logs to /dev/null)"
mvn clean install > /dev/null 2>&1

# Running the app
echo "Running the FooBarQix app"
java -jar target/FooBarTix-*.jar
