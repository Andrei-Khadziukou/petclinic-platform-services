# Pet Clinic Gateway Server

The proxy server based on Netflox Zuul and provides routing abilities for all REST calls.

## How To Run
1. Use Gradle to run by `gradlew -p gateway bootRun` in the root sub-project folder.
2. Use jar file to run by `java -jar build/libs/*-exec.jar` in the root sub-project folder.
The application starts on the port defined in the application.yml file `server.port: <port>`.

After running this server calls to this application will be redirected to services:
* `http://<server-host>:<server-port>/api/orders` will be redirected to `ORDER_SERVICE`
* `http://<server-host>:<server-port>/api/services` will be redirected to `CLIENT_SERVICE`
* `http://<server-host>:<server-port>/api/animals` will be redirected to `CLIENT_SERVICE`
* `http://<server-host>:<server-port>/api/clinics` will be redirected to `CLIENT_SERVICE`

Helth check info:
* Use the URL `http://localhost:8083/api/orders/health` to get health check information from Order Service
* Use the URL `http://localhost:8083/api/clinics/health` to get health check information from Client Service
* Use the URL `http://localhost:8083/api/animals/health` to get health check information from Client Service
* Use the URL `http://localhost:8083/api/services/health` to get health check information from Client Service
