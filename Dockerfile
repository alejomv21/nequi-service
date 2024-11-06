FROM maven:3.3.5-openjdk-21 AS build
WORKDIR /app
COPY pom.xml ./
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:21-ea-2-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Define variable de entorno (opcional)
ENV SPRING_PROFILES_ACTIVE=prod

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]