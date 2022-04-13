def call(){
	node {
		bat '''
            echo 'test 1'
            git --version
            echo 'test 2'
            mvn --version
        '''
	}
}