pipeline {
    agent any

    stages {
        stage('Git Checkout') {
            steps {
                git credentialsId: 'a156d537-8472-40e6-ae9c-ab81fe61c53c', url: 'https://github.com/thetechpush/jenkins-maven.git'
            }
        }
        stage('Deploy Maven') {
            steps {
                sh label: '', script: 'sh maven.sh'
            }
        }
        stage('Building Java Application') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
