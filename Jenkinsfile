pipeline {
    agent any
    tools {
        maven 'MavenTest'
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