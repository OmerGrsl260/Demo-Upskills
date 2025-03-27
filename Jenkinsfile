pipeline {
    agent any
    
    tools {
        maven 'Maven 3.9.9'
        jdk 'JDK 17'
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                bat 'mvn test'
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