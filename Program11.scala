object Program11 {
def getMaxMinFromSet(s: Set[Int]) : Unit = { val max = s.max
val min = s.min


println(s"Max element: ${max}, Min element: ${min}")
println()
}




def convert(l1: List[Int], l2: List[Int], m1: Map[String, String], m2: Map[String, String]) : Unit = {
 
val map = l1.zip(l2).toMap 
println("The Map is: ", map)

val list1 = m1.keySet.toList 
val list2 = m2.keySet.toList

println(s"List from map 1: ${list1.mkString(" ")}") 
println(s"List from map 2: ${list2.mkString(" ")}")
println()
}


def iterateOverList(l: List[Int]) : Unit = { 
	val itr = l.iterator
while (itr.hasNext) { 
	print(itr.next()) 
	print("=>")
}
}


def get20Even() : Unit = {
val nums = (300 to 400).filter(_ % 2 == 0).take(20).toList.mkString("->") 
println(nums)
println()
}

def main(args: Array[String]) : Unit = { 
	val l1 = List(1, 2, 3, 4)
val l2 = List(10, 20, 30, 40)
 
val map1 = Map("Hello" -> "World", "Lucy" -> "youtu.be/ znoeHzG1vqY")
val map2 = Map("Python" -> "DAABan", "Feeling" -> "Sad") 
val s = Set(4, 2, 1, 1, 2, 1, 5, 0)
getMaxMinFromSet(s) 
convert(l1, l2, map1, map2) 
iterateOverList(l1) 
get20Even()

}
}
