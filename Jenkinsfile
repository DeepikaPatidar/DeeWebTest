#!/usr/bin/groovy

pipeline {
    agent any 
    stages {
        stage('Checkout') {
        steps {
                   checkout scm
                   echo 'Checkout stage'
               }             
            }
        stage('Build') {
            steps {
                   sh "mvn clean install -DskipTest"
                   echo 'build stage'
               }             
            }
         stage('Test') {
            steps {
                   sh "mvn test"
                   echo 'test stage'
               }             
            }
        }
    }