#!/usr/bin/groovy

properties([
	parameters([
		booleanParam(
			defaultValue: 'develop',
			description: 'Environment for running regression test',
			name: 'Environment'
			),
		booleanParam(
			defaultValue: true,
			description: 'Perform Smoke test if true',
			name: 'PERFORM_SMOKE_TEST'
			)
	])
])

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