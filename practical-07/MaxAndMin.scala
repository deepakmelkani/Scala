object MaxAndMin
{
    def main(args: Array[String])
    {
        println("Min and Max from 5, 7")
                maxAndMin(5, 7);
    }
    def maxAndMin(a: Int, b: Int) = {
       def maxValue() = {
          if(a > b)
          {
              println("Max is: " + a)
          }
          else
          {
              println("Max is: " + b)
          }
       }
       def minValue() = {
          if (a < b)
          {
              println("Min is: " + a)
          }
          else
          {
              println("Min is: " + b)
          }
       }
       maxValue();
       minValue();
    }
}