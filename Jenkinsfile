pipeline {
    agent any
    parameters {
        string(name: 'USER', defaultValue: '', description: 'Leave blank and a generated user will be issued')

        password(name: 'PASSWORD', defaultValue: '', description: 'Leave blank and a generated password will be issued')

        string(name: 'MONGO_ROLES', defaultValue: '', description: 'Specify which roles shall be granted to the user')

        choice(name: 'CLUSTER', choices: ['DATAHUB', 'MONITORING'], description: 'Choose target cluster')

        choice(name: 'ENV', choices: ['work.es', 'work.mx','live.es','live.mx'], description: 'Choose SEMaaS target environment')

        text(name: 'REASON', defaultValue: '', description: 'Specify why this user is being created')

    }
    stages {
        stage('Example') {
            steps {
                echo "Hello ${params.USER}"

                echo "Password: ${params.PASSWORD}"

                echo "Cluster Destination: ${params.CLUSTER}"

                echo "Environment Destination: ${params.ENV}"

                echo "Reason of Creation: ${params.REASON}"

            }
        }
    }
}