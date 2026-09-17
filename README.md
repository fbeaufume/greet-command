# Greet command native application

This repository is a sample application for my
[Native command-line tools in Java](https://beaufume.fr/articles/java-native-tools/) article.

It shows how to implement a very basic command-line application in Java and build
native executables using a GitHub workflow. 

## Usage

Build with `mvn package` then run with
`java -jar target\greet-command-1.0.0-SNAPSHOT.jar John Doe` to print `Hello John Doe!`.

Or download a native executable from a GitHub build run and execute `greet John Doe`.
