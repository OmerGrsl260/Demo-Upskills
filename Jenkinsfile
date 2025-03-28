pipeline {
    agent any
    
    tools {
        maven 'Maven 3.9.9'
        jdk 'JDK 17'
    }
    
    environment {
        JAVA_HOME = tool 'JDK 17'
        MAVEN_HOME = tool 'Maven 3.9.9'
        PATH = "${JAVA_HOME}/bin;${MAVEN_HOME}/bin;${env.PATH}"
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                withMaven(maven: 'Maven 3.9.9', jdk: 'JDK 17') {
                    bat '''
                        echo JAVA_HOME=%JAVA_HOME%
                        echo PATH=%PATH%
                        echo MAVEN_HOME=%MAVEN_HOME%
                        mvn clean install -DskipTests
                    '''
                }
            }
        }
        
        stage('Test') {
            steps {
                withMaven(maven: 'Maven 3.9.9', jdk: 'JDK 17') {
                    bat 'mvn test'
                }
            }
        }
        
        stage('Generate Allure Report') {
            steps {
                allure([
                    includeProperties: false,
                    jdk: '',
                    properties: [],
                    reportBuildPolicy: 'ALWAYS',
                    results: [[path: 'target/allure-results']]
                ])
            }
        }
        
        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                echo 'Pipeline GitHub - Pas de déploiement automatique configuré'
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
        success {
            echo "Pipeline réussi sur la branche ${BRANCH_NAME}"
        }
        failure {
            echo "Pipeline échoué sur la branche ${BRANCH_NAME}"
        }
    }
} 