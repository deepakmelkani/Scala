trait Interface {
def show(): Unit = {}
}

class ArgClass extends Interface { def show(args: String*) : Unit = {
args.map(println) 
println()
}
}


object Program12 {

def main(args: Array[String]) : Unit = { val obj = new ArgClass()
obj.show("Super", "Man", "Scala", "World")

val squareRoot = new PartialFunction[Double, Double] {
 
def isDefinedAt(x: Double) = x >= 0 
def apply(x: Double) = Math.sqrt(x)
}


val num = scala.io.StdIn.readLine("Enter a number: ").toFloat 
if (num < 0) {
println("Negative Number")
} else {
println(squareRoot(num))
}
}
}
