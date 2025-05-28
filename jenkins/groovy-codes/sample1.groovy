pipeline { 
    agent any
    
    stages { 
        stage ("greet") {
            steps {
                echo "hello user, Nice to meet you"
            }
        }
    
        stage ("testing") {
            steps {
                echo "test successful"
            }
        }
        stage ("happy") {
            steps {
                echo "I'm so happy I finally went skydiving—one more thing checked off the bucket list!"
            }
        }
    }
}
