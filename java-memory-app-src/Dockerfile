FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy app source
COPY java-app/MemoryApp.java .

# Download JMX Prometheus Java Agent
ADD https://repo1.maven.org/maven2/io/prometheus/jmx/jmx_prometheus_javaagent/0.20.0/jmx_prometheus_javaagent-0.20.0.jar jmx_prometheus_javaagent.jar

# Compile app
RUN javac MemoryApp.java

# Create config dir
RUN mkdir /jmx-exporter

# Copy default config (provided by Kubernetes ConfigMap at runtime)
CMD ["java", "-javaagent:/jmx-prometheus-javaagent.jar=9404:/jmx-exporter/config.yaml", "MemoryApp"]

