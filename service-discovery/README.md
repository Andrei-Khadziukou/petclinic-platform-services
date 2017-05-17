# Pet Clinic Service Discovery Server

The Service Discovery server based on Netflix Eureka and provides abilities for peer to peer communication for all clients. Also the server provides information about other services (their availability, URLs and so on).

## How To Run
1. Use Gradle to run by `gradlew -p service-discovery bootRun` in the root repo folder.
2. Use jar file to run by `java -jar build/libs/*-exec.jar` in the root sub-project folder.
The application starts on the port defined in the application.yml file `server.port: <port>`.

Navigate your browser to `http://localhost:8080/` to see home page with statistics.
