pipeline {
    agent any
    
    environment {
        DOCKERHUB_CREDENTIALS = credentials('VarDockerHub') 
        HARBOUR_CREDENTIALS = credentials('harbour')
    }

    stages {
        stage('git checkout') {
            steps {
                sh 'ls -lrt /home/ubuntu/'
                sh 'chmod -R 777 /home/ubuntu/workspace'
                sh 'cd ./reifenlabel-service'
                sh 'ls -lrt reifenlabel-service'
                sh 'cd reifenlabel-service'
                sh 'ls'
                sh 'pwd'
                git credentialsId: 'pkumara', 
                    //url: 'https://git.daimler.com/mbrdi/reifenlabelservice'
                    url: 'https://git.daimler.com/mbrdi/reifenlabelservice/'
            }
        }
        
        stage('docker build') {
            steps {
                sh 'docker build -t sampledockerimage reifenlabel-service/.'
                sh 'docker images'
            }
        }
        
        stage('docker run') {
            steps {
                sh 'docker run sampledockerimage'
            }
        }
        
        stage('login to the dockerhub') {
            steps {
                //sh 'echo ${DOCKERHUB_CREDENTIALS_PSW} | docker login -u ${DOCKERHUB_CREDENTIALS_USR} --password-stdin'
                //sh 'echo ${HARBOUR_CREDENTIALS_PSW} | docker login -u ${HARBOUR_CREDENTIALS_USR} --password-stdin https://registry.app.corpintra.net/'
                sh 'docker login https://registry.app.corpintra.net/ -u SHASHIC -p 1MZPOZ5QSa'
            }
        }
        
        stage('pushing image into dockerhub') {
            steps {
                sh 'docker push sampledockerimage'
            }
        }
    }
    
    post {
        always {
            sh 'docker logout'
        }
    }
}
