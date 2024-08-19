# Steps followed

## Docker Setup

Created an image of jenkins with maven (Dockerfile)
Built using command : docker build -t jenkins-with-maven:3.8.1 .
run using command : docker run -d -p 8080:8080 -p 50000:50000 --name my-jenkins-maven jenkins-with-maven:3.8.1

Follow the inital steps to setup jenkins account by giving secret key.
Commands : 
docker exec -it jenkins /bin/bash
cat /var/jenkins_home/secrets/initialAdminPassword

## Jenkins

1. Created Multibranch pipeline with name as Knime manually and assigned git repo
2. Created Pipeline specific to Pull Requests with same config
3. Created SecondPipeline to get the artifacts and run it from previous builds.

## Web hooks

1. Created App Password and API token in jenkins
2. Created Webhook for PR handling to specify it for PullRequest pipeline. 
3. Created Webhook for branch builds for Knime jobs.
4. localhost ip is blocked by bitbucket so we can't get webhooks through to jenkins so used serveo (available in git bash) to expose my jenkins.
    cmd : ssh -R 80:localhost:8080 serveo.net
    
## Jenkins Plugins used :
plugins:
    # List of plugins and their versions
    Add the below section in "jenkins.yaml" if being configured by JCasC.
    
    required:
      - bitbucket: "2.9.3"
      - bitbucket-branch-source: "2.12.0"
      - copyartifact: "1.60"
      - jacoco: "3.0.1"
      - pipeline: "2.6"
      - git: "4.10.1"
