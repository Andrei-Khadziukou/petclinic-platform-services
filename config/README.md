# Pet Clinic Config Server

It is a server which connects to GitHub repository (https://github.com/Andrei-Khadziukou/petclinic-properties) and provides the access to the Spring context properties holded in that repository for other applications.

## How To Run
1. Use Gradle to run by `gradlew bootRun` in the root sub-project folder.
2. Use jar file to run by `java -jar build/libs/*-exec.jar` in the root sub-project folder.
The application starts on the port defined in the application.yml file `server.port: <port>`.

### Useful links
// TODO find links