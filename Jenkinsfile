pipeline{
  agent any

  environment {
    CI = 'true'
    dockerimage = ''
}
stages{
stage('Stage 1: Git Pull') {
  steps {
      git url: 'https://github.com/unbalancedvariance/SPE_Mini_Project.git',
      branch: 'main',
      credentialsId: ''
} }
stage('Stage 2:Build') {
  steps {
      sh 'mvn clean install'
} }

stage('Stage 3:Build Docker Image') {
  steps {
    script{
       dockerimage = docker.build "unbalancedvariance/calc:latest"
} }
}

stage('Stage 4:Push Image to dockerHub') {
    steps {
      script{
        docker.withRegistry('','DockerCred'){
        dockerimage.push()
        }
} }
}

stage('Stage 5: Clean docker images') {
  steps {
    script {
    sh 'docker container prune -f'
    sh 'docker image prune -f'
    }
  }
 }

 stage('Stage 6: Pull the docker image') {
  steps {
    script {
    sh 'docker pull unbalancedvariance/calc'
    }
  }
 }

stage('Step 7: Ansible Deployment') {
  steps {
    ansiblePlaybook(
    becomeUser: null,
    colorized: true,
    credentialsId: 'localhost',
    disableHostKeyChecking: true,
    installation: 'Ansible',
    inventory: 'Deployment/inventory',
    playbook: 'Deployment/deploy.yml',
    sudoUser: null
    )
  }
}


}
}