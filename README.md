# maven-docker-compose-example-project

An example project showing how to run integration tests for a Java project using Maven.
The integration test environment is defined in the `docker-compose.yml`.
The app under test is packaged into a docker container via the `Dockerfile`

## Usage

```
./mvnw clean package
```

## Links
* [dockerfile-maven-plugin](https://www.github.com/spotify/dockerfile-maven) - Invokes `docker` to build this app's container
* [docker-compose-maven-plugin](https://github.com/dkanejs/docker-compose-maven-plugin) - Invokes `docker-compose` to start a test environment
* [SO maven-jar-plugin finalName](https://stackoverflow.com/questions/4238944/controlling-maven-final-name-of-jar-artifact) - Rename final artifact
* [maven-failsafe-plugin](https://maven.apache.org/surefire/maven-failsafe-plugin/) - Maven Failsafe Plugin for running integration tests
