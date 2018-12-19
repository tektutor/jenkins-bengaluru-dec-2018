pipeline {
	agent any

	stages {
		stage('Clone GitHub Project') {
			steps {
				git 'https://github.com/tektutor/jenkins-bengaluru-dec-2018.git'
			}
		}
		stage('Build Docker Image') {
			steps {
				sh 'docker build -t tektutor/jenkins-slave Day2'
			}
		}
		stage('Compile Maven Project') {
			agent { docker 'tektutor/jenkins-slave' }
			steps {
				git 'https://github.com/tektutor/jenkins-bengaluru-dec-2018.git'
				sh 'cd Day2/CRM;mvn clean package'
				junit '**/target/surefire-reports/TEST-*.xml'
				archiveArtifacts artifacts: 'Day2/CRM/main/target/*.jar', fingerprint: true
			}
		}
	}

}
