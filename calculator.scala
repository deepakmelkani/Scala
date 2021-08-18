class calc
{
	def +(a:Int,b:Int): Int = a+b
	def -(a:Int,b:Int): Int = a-b
	def *(a:Int,b:Int): Int = a*b
	def /(a:Int,b:Int): Int = a/b
}
object calculator
{
	def main(args: Array[String])
	{
		val calc = new calc();
		println("addition : ",calc.+(15,5))
		println("subtraction : ",calc.-(15,5))
		println("multiplication : ",calc.*(15,5))
		println("division : ",calc./(15,5))
	}
}