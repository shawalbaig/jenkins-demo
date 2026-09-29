pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
                sh './mvnw clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh './mvnw test'
            }
        }
    }
}