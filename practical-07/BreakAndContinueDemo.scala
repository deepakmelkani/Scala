import util.control._

object BreakAndContinueDemo extends App {

  /*Breaks [Obj], Breaks.breakable [Construct], Breaks.break [Method]*/
  val breakObj = new Breaks;
	
  /*Break out of the for loop and breakable construct*/
  println("\n=== 1. BREAK EXAMPLE ===");
  breakObj.breakable {
    for (i <- 1 to 10) {
      println(i)
      if (i == 3){
		  breakObj.break  
	  }
    }
  }
  println("\n")
	
}