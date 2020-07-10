pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk_1.8.0_151'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn install' 
            }
        }
    }
}