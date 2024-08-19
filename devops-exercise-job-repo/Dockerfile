FROM jenkins/jenkins:latest

USER root

# Install Maven
RUN apt-get update && apt-get install -y maven

# Switch back to the Jenkins user
USER jenkins