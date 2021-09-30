object MinandMax
{
    def main(args: Array[String])
    {
        fun();
    }
    def fun() = {
         
        peeks();
        def peeks() = {
            println("peeks");
             
            abc();
            def abc() = {
                println("abc");
 
                scalacode();
                def scalacode() = {
                    println("scalacode");
                }
            }
        }
    }
}