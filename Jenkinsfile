#!/usr/bin/groovy

pipeline {
    agent any 
    stages {
        stage('Checkout') {
            container ('maven') {
               try{
                   checkout scm
               } catch(err){
                   echo 'Checkout stage'
                   echo err.message
               }             
            }
        }
        stage('Build') {
            container ('maven') {
               try{
                   sh "mvn clean install -DskipTests"
               } catch(err){
                   echo 'build stage'
                   echo err.message
               }             
            }
        }
         stage('Test') {
            container ('maven') {
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