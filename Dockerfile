# Use the official OpenJDK 17 runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built jar from the target folder into the container
COPY target/InventoryManagement-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
