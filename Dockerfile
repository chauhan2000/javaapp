FROM openjdk:11-jre-slim

# Add New Relic agent to container
COPY newrelic-agent.jar /app/newrelic.jar

# Set Java options to use the New Relic agent
ENV JAVA_OPTS="-javaagent:/app/newrelic.jar"
WORKDIR /app
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar

# Run your Java application
CMD ["java", "-jar", "myapp.jar", "$JAVA_OPTS"]
