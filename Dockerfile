FROM eclipse-temurin:17

LABEL mentainer="vedha@gmail.com"

WORKDIR /app

COPY target/SpringBootDocker-0.0.1-SNAPSHOT.jar /app/SpringBootDocker.jar

ENTRYPOINT ["java", "-jar", "SpringBootDocker.jar"]