pipeline {
  agent any
  stages {
    stage('Example') {
      steps {
        echo "Hello ${params.USER}"
        echo "Password: ${params.PASSWORD}"
        echo "Cluster_Destination: ${params.CLUSTER}"
        echo "Environment_Destination: ${params.ENV}"
        echo "Reason_of_Creation: ${params.REASON}"
      }
    }
    stage('Create Password') {
     environment {
                    GREEK_USER_PASSWORD = load 'password.groovy'
                }
      steps {
        echo "Password: ${GREEK_USER_PASSWORD}"
      }
    }
    stage('Create User') {
         environment {
                        GREEK_USER_NAME = load 'user.groovy'
                    }
          steps {
            echo "Username: ${GREEK_USER_NAME}"
          }
        }
  }
  parameters {
    string(name: 'USER', defaultValue: '', description: 'Leave blank and a generated user will be issued')
    password(name: 'PASSWORD', defaultValue: '', description: 'Leave blank and a generated password will be issued')
    string(name: 'MONGO_ROLES', defaultValue: '', description: 'Specify which roles shall be granted to the user')
    choice(name: 'CLUSTER', choices: ['DATAHUB', 'MONITORING'], description: 'Choose target cluster')
    choice(name: 'ENV', choices: ['work.es', 'work.mx','live.es','live.mx'], description: 'Choose SEMaaS target environment')
    text(name: 'REASON', defaultValue: '', description: 'Specify why this user is being created')
  }
}