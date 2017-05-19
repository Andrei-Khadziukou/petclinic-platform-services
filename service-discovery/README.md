# Pet Clinic Service Discovery Server

The Service Discovery server based on Netflix Eureka and provides abilities for peer to peer communication for all clients. Also the server provides information about other services (their availability, URLs and so on).

## How To Run
1. Use Gradle to run by `gradlew -p service-discovery bootRun` in the root repo folder.
2. Use jar file to run by `java -jar build/libs/*-exec.jar` in the root sub-project folder.
The application starts on the port defined in the application.yml file `server.port: 8080`.

Navigate your browser to `http://localhost:8080/` to see home page with statistics.

## Configuration
Use environment variables to configure Service Discovery server:
* Service Discovery server host name - `SERVICE_DISCOVERY_HOST`
* Service Discovery server port - `SERVICE_DISCOVERY_PORT`

// TODO disabled for now
Run application with profile `multipeers` to have capability to configure cluster environment 
of Server Discovery services. Use next environment variables to configure instances
* Service Discovery server host name for current instance of the server - `CURRENT_PEER_HOST_NAME`
* Other Service Discovery server hosts (it is possible to use comma separated list of URLs) - `PEER_HOSTS`

Notes: 
* every URL of Service Discovery server in the `PEER_HOSTS` variable should follow the next pattern: **http(s)://\<another_host\>:\<port\>/eureka**
* don't repeat current instance host in the list of URLs for the `PEER_HOSTS` variable
