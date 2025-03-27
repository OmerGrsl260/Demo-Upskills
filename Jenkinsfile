pipeline {
    agent any
    
    tools {
        maven 'Maven 3.8.4'
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
                sh 'mvn clean install -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test'
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
                echo 'Déploiement en production...'
                // Ajoutez ici vos commandes de déploiement
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