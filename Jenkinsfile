#!/usr/bin/groovy

pipeline {
    agent any 
    stages {
        steps('Checkout') {
            container ('maven') {
               try{
                   checkout scm
               } catch(err){
                   echo 'Checkout stage'
                   echo err.message
               }             
            }
        }
        steps('Build') {
            container ('maven') {
               try{
                   sh "mvn clean install -DskipTests"
               } catch(err){
                   echo 'build stage'
                   echo err.message
               }             
            }
        }
         steps('Test') {
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