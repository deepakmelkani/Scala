import scala.util.matching.Regex 
object Program13 {
def printMessage(month: String) : Unit = {

val res = month match {
case "October" => println("It is winter now") 
case "November" => println("It is winter now") 
case "December" => println("It is winter now") 
case "January" => println("It is winter now") 
case "February" => println("It is winter now")
case other => println(s"It is $other, and Winter will come again!")
}
println()
}
 

def main(args: Array[String]) : Unit = {

val m = scala.io.StdIn.readLine("Enter a month: ") 
printMessage(m)

val str = scala.io.StdIn.readLine("Enter a string: ") 
val pattern = new Regex("(C|c)an")
val cnt = (pattern findAllIn str).length
println(s"\nNo of time can/Can appeared in the string: $cnt")

val replacedStr = (pattern replaceAllIn(str, "could")) 
println(s"String after replacement: $replacedStr")

}
}
