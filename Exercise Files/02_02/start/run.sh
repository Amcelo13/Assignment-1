#!/bin/bash

# Set the classpath with all required JARs
CLASSPATH=".:$(echo lib/*.jar | tr ' ' ':'):$(echo *.jar | tr ' ' ':')"

# Compile the Java file
echo "Compiling..."
javac -cp "$CLASSPATH" test/KeyboardAndMouseInput.java

# Run the compiled class
echo "Running..."
java -cp "$CLASSPATH:test" KeyboardAndMouseInput
