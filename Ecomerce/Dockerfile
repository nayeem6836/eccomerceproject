# Use OpenJDK as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the correct JAR file
COPY target/app.jar app.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
