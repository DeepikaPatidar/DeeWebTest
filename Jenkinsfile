#!/usr/bin/groovy

pipeline {
    agent any 
    stages {
        stage('Checkout') {
        steps{
               try{
                   checkout scm
               } catch(err){
                   echo 'Checkout stage'
                   echo err.message
               }             
            }
        }
        stage('Build') {
            steps {
               try{
                   sh "mvn clean install -DskipTests"
               } catch(err){
                   echo 'build stage'
                   echo err.message
               }             
            }
        }
         stage('Test') {
            steps {
               try{
                   sh "mvn test"
               } catch(Exception err){
                   echo 'test stage'
                   echo err.message
               }             
            }
        }
    }
}