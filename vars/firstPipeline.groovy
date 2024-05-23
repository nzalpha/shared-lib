import com.nzdigi.builds.Calculator

def call(Map pipelineParams){

    Calculator cal= new Calculator(this)
    pipeline{
        agent any
        environment{
            app_name="${pipelineParams.appName}"
        }
        stages {
            stage('Addition Stage')
            {
                steps{
                    script{
                    echo "Printing sum of 2 numbers"
                    println cal.add(19,20)
                    echo "My microservice name is: ${app_name}"
                    }
                }
            }

            stage('Mailing')
            {
                steps{
                    echo "Sending a mail!"
                }
            }
        }
    }
} 