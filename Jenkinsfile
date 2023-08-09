pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "./gradlew clean build -x test"
            }
        }
        stage('Test') {
            steps {
                bat "./gradlew test"
            }
        }
    }
}