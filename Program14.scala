import  java.io.File 
import java.io.PrintWriter

trait Handle[T] {
def show(x: T): String
}
 
object Program14 {



val handleString: Handle[List[String]] = new Handle[List[String]] { 
	def show(listStr: List[String]): String = s"List of String: $listStr"
}

val handleInt: Handle[List[Int]] = new Handle[List[Int]] {
def show(listInt: List[Int]): String = s"List of Integers: $listInt"
}

def zeroDivisionException(n: Int) : Unit = { 
	try {
val res = n / 0 
println(res)
} catch {
case a: ArithmeticException => { 
	println("Division By Zero!")
}
} finally {
println("This is final block.")
}
println()
}


def getFactorial(n: Int) : String = { 
	var res = ""
for (i <- 1 to n) {
res += i.toString + ", "
}
println(s"Factorial of $n written to file!")
 
return res
}


def factorialToFile(n: Int) : Unit = { 
	val file = new File("file.txt")
val writer = new PrintWriter(file) 
val factorial = getFactorial(n)

writer.write(factorial) 
writer.close()

}

def shoppingCart(item: String) : Unit = {
val iceCream = Map("Name" -> "IceCream", "Price" -> 2.99, "Quantity"-> 10)
val biscuits = Map("Name" -> "Biscuits", "Price" -> 3.99, "Quantity" ->3)
val cupCakes = Map("Name" -> "Cupcakes", "Price" -> 4.99,"Quantity" -> 5)

val res = item match {
case "IceCream" => iceCream 
case "Cupcakes" => cupCakes 
case "Biscuits" => biscuits
case other: String => s"$other is not listed!"
}
println(res)
}
 

def main(args: Array[String]) : Unit = {


zeroDivisionException(5) 
println(handleInt.show(List(1, 2, 3)))
println(handleString.show(List("Scala", "Python", "JS"))) 
println()
factorialToFile(3) 
shoppingCart("Cupcakes") 
shoppingCart("Burgers")
}
}
