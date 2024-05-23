import com.nzdigi.builds.Calculator
Calculator cal= new Calculator(this)
pipeline{
    agent any
    stages {
        stage('Addition Stage')
        {
            steps{
                script{
                echo "Printing sum of 2 numbers"
                println cal.add(19,20)
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