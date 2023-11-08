pipeline{
  agent any

  environment {
    CI = 'true'
    dockerimage = ''
}
stages{

stage('Git Pull') {
  steps {
      git url: 'https://github.com/unbalancedvariance/SPE_Mini_Project.git',
      branch: 'main',
      credentialsId: ''
} }
stage('Build') {
  steps {
      sh 'mvn clean install'
} }

stage('Build Docker Image') {
  steps {
    script{
       dockerimage = docker.build "unbalancedvariance/calc:latest"
} }


}
stage('Push Image to dockerHub') {
    steps {
      script{
        docker.withRegistry('','DockerCred')
        dockerimage.push()
} }
}

// stage('Stage 5: Clean docker images') {
//   steps {
//     script {
//     sh 'docker stop calc'
//     sh 'docker rm calc'
//     sh 'docker container prune −f'
//     sh 'docker image prune −f'
//     }
//   }
//  }

// stage('Step 6: Ansible Deployment') {
//   steps {
//     ansiblePlaybook(
//     becomeUser: null,
//     colorized: true,
//     credentialsId: 'localhost',
//     disableHostKeyChecking: true,
//     installation: 'Ansible',
//     inventory: 'Deployment/inventory',
//     playbook: 'Deployment/deploy.yml',
//     sudoUser: null
//     )
//   }
// }
}
}