class public_a
{
    var a:Int = 123
}
object access extends public_a
{
	def main(args: Array[String])
	{
		var e = new public_a()
   		e.a = 444    
    	println(e.a)
	}
   
}