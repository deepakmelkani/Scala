object add {
  def test(x:Int, y:Int) : Int = x + y
     
   def main(args: Array[String]): Unit = {
   	val a:Int =5
   	val b:Int =5
    println("Result: " + test(a, b));
    //a=10
    //b=10
    //println("Result: " + test(a, b));
   }
}