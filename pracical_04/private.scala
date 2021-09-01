class new1
{ 
    private var a:Int = 123
    def display()
    {
        a = 8
        println(a)
    }
}
  
object private1 extends new1
{
    def main(args: Array[String]){
	var e=new new1()
	e.display();	
	}
}