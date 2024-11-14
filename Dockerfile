FROM openjdk:17-jdk-slim

COPY target/Recipe-Sharing-0.0.1-SNAPSHOT.jar Recipe-Sharing-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "Recipe-Sharing-0.0.1-SNAPSHOT.jar"]