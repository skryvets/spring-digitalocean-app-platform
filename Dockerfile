# Stage 1: Build the application
FROM eclipse-temurin:17-jdk-alpine as builder
WORKDIR /app
COPY . /app
RUN ./gradlew build

# Stage 2: Create the final image
FROM eclipse-temurin:17-jre-alpine
VOLUME /tmp
COPY --from=builder /app/build/libs/spring-digitalocean-app-platform-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
