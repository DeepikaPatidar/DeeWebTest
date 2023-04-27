#!/usr/bin/groovy

pipeline {
    agent {

        
         docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }

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
                   sh 'mvn clean install -DskipTest'
                   echo 'build stage'
               }             
            }
         stage('Test') {
            steps {
                   sh 'mvn test'
                   echo 'test stage'
               }             
            }
        }
    }