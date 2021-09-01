class new2
{ 
    protected var a:Int = 123
    def display()
    {
        a = 8
        println(a)
    }
}
class new1 extends new2
{
    def display1()
    {
        a = 9
        println(a)
    }
}
  
object protected1 extends new1
{
    def main(args: Array[String])
    {
        var e = new new2()
        e.display()
        var e1 = new new1()
        e1.display1()
    }
}