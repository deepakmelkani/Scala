object Student{
    def powerof(a: Int): Unit = {
        println(a+" raised to the power of 2 = "+(a*a))
        println(a+" raised to the power of 3 = "+(a*a*a))
        println(a+" raised to the power of 4 = "+(a*a*a*a))
    }

    def powerof(a: Double): Unit = {
        println(a+" raised to the power of 2 = %.2f".format(a*a))
        println(a+" raised to the power of 3 = %.3f".format(a*a*a))
        println(a+" raised to the power of 4 = %.4f".format(a*a*a*a))
    }

    def isPrime(n: Int): Int = {
        if (n == 0 || n ==1){
            return 0
        }
        for (i <- 2 until n){
            if (n%i == 0){
                return 0
            }
        }
        return 1
    }

    def main(args: Array[String]){
        var studmarks = 75
        if (studmarks > 65){
            studmarks += 20
            println("Student passed the exam with distinction")
            println("New marks: "+studmarks)
        }
        var choice = scala.io.StdIn.readLine("\nEnter a value to find it's square, cube and fourth power. Do you want to check for:\n1. an Int Value\t\t\t2. a Float Value\nEnter your choice: ").toInt
        if (choice == 1){
            var a = scala.io.StdIn.readLine("Enter your value: ").toInt
            powerof(a)
        }
        else{
            var a = scala.io.StdIn.readLine("Enter your value: ").toDouble
            powerof(a)
        }
        var pr = scala.io.StdIn.readLine("Enter value for Prime check: ").toInt
        if (isPrime(pr) == 0){
            println(pr+" is not Prime")
        }
        else{
            println(pr+" is Prime")
        }
    }
}