pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
                sh './mvnw clean compile'
            }
        }

        stage('Parallel Tests') {
            parallel {

                stage('Unit Tests') {
                    steps {
                        echo 'Running unit tests...'
                        sh './mvnw test -Dtest=LoanServiceTest'
                    }
                }

                stage('Integration Tests') {
                    steps {
                        echo 'Running integration tests...'
                        sh './mvnw test -Dtest=LoanServiceIntegrationTest'
                    }
                }

                stage('Application Tests') {
                    steps {
                        echo 'Running application tests...'
                        sh './mvnw test -Dtest=JenkinsDemoApplicationTests'
                    }
                }
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the application...'
                sh './mvnw package -DskipTests'
            }
        }
    }
}

// pipeline {
//     agent any
//
//     stages {
//         stage('Build') {
//             steps {
//                 echo 'Building the application...'
//                 sh './mvnw clean compile'
//             }
//         }
//
//         stage('Test') {
//             steps {
//                 echo 'Running tests...'
//                 sh './mvnw test'
//             }
//         }
//         stage('Package') {
//                     steps {
//                         echo 'Packaging the application...'
//                         sh './mvnw package -DskipTests'
//                     }
//         }
//     }
// }