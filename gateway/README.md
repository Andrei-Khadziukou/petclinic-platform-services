# Zuul server for Pet Clinic project

It provides routing abilities for calls from UI.
Repository: https://github.com/Andrei-Khadziukou/petclinic-zuul.

After running this server calls to this application will be redirected to services
* `http://<server-host>:<server-port>/api/orders` will be redirected to `ORDER_SERVICE`
* `http://<server-host>:<server-port>/api/services` will be redirected to `CLIENT_SERVICE`
* `http://<server-host>:<server-port>/api/animals` will be redirected to `CLIENT_SERVICE`
* `http://<server-host>:<server-port>/api/clinics` will be redirected to `CLIENT_SERVICE`

**See details about ORDER_SERVICE and CLIENT_SERVICE service in Eureka Pet Server** (https://github.com/Andrei-Khadziukou/petclinic-eureka).

## How it works
* Run all applications using `gradlew bootRun` in the project roots (Zuul Server, Eureka server, Order Service and Client Service)
* Run browser
* Use the URL `http://localhost:8083/api/orders/health` to get health check information from Order Service
* Use the URL `http://localhost:8083/api/clinics/health` to get health check information from Client Service (same for URLs: `http://localhost:8083/api/animals/health`, `http://localhost:8083/api/services/health`)
