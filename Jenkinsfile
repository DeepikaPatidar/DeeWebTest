#!/usr/bin/groovy

pipeline {
    agent any 
     tools {
        maven "MAVEN"
        jdk "JDK"
    }
    stages {
        stage('Checkout') {
        steps {
                   checkout scm
                   echo 'Checkout stage'
               }             
            }
        stage('Build') {
            steps {
                   bat 'mvn clean install -DskipTests'
                   echo 'build stage'
               }             
            }
         stage('Test') {
            steps {
                   bat 'mvn test'
                   echo 'test stage'
               }             
            }
        }
    }