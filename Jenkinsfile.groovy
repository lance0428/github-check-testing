pipeline {
	agent { label 'Android' }
        stages {
	        stage('Build') {
			steps {
				sh 'echo "Hello World"'
			}
		}
	}
}
