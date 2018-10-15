#Course-app
A simple course management app written in java with Spring Boot support and Heroku deployment.
## Prerequisites
- JDK 1.8 or above
- Maven
- Heroku CLI
- Postgresql
## Local run

- Create a custom .env file (e.g .env.dev ) containing variables that will be later used by Heroku. An example of its content:
```
JDBC_DATABASE_URL=jdbc:postgresql://localhost:5432/course_app
JDBC_DATABASE_USERNAME=postgres
JDBC_DATABASE_PASSWORD=postgres
PORT=8080
```
- Create a custom Profile file (e.g Procfile.dev):
```
web: mvn package && java -Dserver.port=$PORT $JAVA_OPTS -jar target/course-app-0.0.1-SNAPSHOT.jar
```
- Start it:
```
heroku local web -e .env.dev -f Procfile.dev
```

Course-app is now locally hosted and you may visit its swagger UI doc at: [Swagger-UI at 8080](http://localhost:8080/swagger-ui.html#/) 