# Pet Clinic Authentication Server

It is a server which provides authentication and authorization services.

## Initialize database structure
1. Use Gradle to run by `gradlew -p auth-server createDatabase` in the root sub-project folder. It creates user and database.
(see [gradle.properties](gradle.properties) file for configuration)
2. Use Gradle to run by `gradlew -p auth-server update` in the root sub-project folder. It adds test users to authorize in system.
> Use Gradle to run by `gradlew -p auth-server dropDatabase` in the root sub-project folder to delete database and user.

## There are ways to run service
1. Use Gradle to run by `gradlew -p auth-server bootRun` in the root sub-project folder.
2. Use jar file to run by `java -jar build/libs/*-exec.jar` in the root sub-project folder.
The application starts on the port defined in the application.yml file `server.port: <port>`.

### Useful links
// TODO find links
