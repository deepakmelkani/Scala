object Program9  { def ques1() : Unit = {
var z: Array[String] = new Array[String](3) 
z(0) = "Zara"
z(1) = "Nuha"
z(4/2) = "Ayan"


println(s"Array length: ${z.size}")
}


def ques2() : Unit = {
 
var z = Array("Ayan","Zara","Ayan")
/*
z(0)=123 gives: z(0)=123`
^
error: type mismatch; found	: Int(123) required: String
*/
}


def ques3() : Unit = {
var z = Array(123,123,123)
/*
z(0)="Aryan" gives: z(0)="Aryan"
^
error: type mismatch; found	: String("Aryan") required: Int
*/
}

def ques4() : Unit = {
val z = Array("Zara", "Nuha", "Ayan") 
z(0) = "Zara"
// z cannot be re-assigned but the Array elements are mutable
}

def ques5() : Unit = {
val z1 = Array("Zara", "Nuha", "Ayan")
 
val z2 = Array("Zara", "Nuha", "Ayan")
/*
z2=z1 gives:
z2=z1
^
error: reassignment to val
*/
for(x <- z2) { println(x)
}
}


def sortArray(arr: Array[Int]) : Unit = { for (i<-0 until arr.size) {
for (j<-0 until arr.size - i - 1) { if (arr(j) > arr(j+1)) {
val tmp = arr(j)
arr(j) = arr(j+1) 
arr(j+1) = tmp
}
}
}
println(s"Sorted Array: [${arr.mkString(" ")}]")
}


def matrixPrint(mat: Array[Array[Int]]) : Unit = { for (i <- Array.range(mat.size-1, -1, -1)) {
for (j <- Array.range(mat(i).size-1, -1, -1)) { print(s"${mat(i)(j)} ")
}
println()
 
}
}


def printDivideBy3(mat: Array[Array[Int]]) : Unit = { val N = mat(0).size - 1
for (i<-0 until mat.size) {
for (j<-0 until mat(i).size) { print(s"${mat(i)(N) / 3} ")
}
println()
}


for (i<-0 until mat.size) {
for (j<-0 until mat(i).size) { print(s"${i+1} ")
}
println()
}
}


def pattern1(n: Int) : Unit = { println()
val arr = Array.ofDim[Char](n,n) 
for(i<-0 until n)
for(j<-0 until n) 
	if(j<=i)
arr(i)(j)='*' else
arr(i)(j)=' ' 
for(i<-0 until n)
{
 
for(j<-0 until n) 
	print(arr(i)(j))
println()
}
}


def pattern2(n: Int) : Unit ={ println()
val arr = Array.ofDim[Char](n,n) 
for(i<-0 until n)
{
	for(j<-0 until n) 
	if(j>=i){
		arr(i)(j)='*'
	}
 else{
 	arr(i)(j)=' '
 }
}


for(i<-0 until n){ 
	println(arr(i).mkString(""))
}
}


def populate() : Unit = {
val arr = Array.range(1,20,3) 
println(s"\nArray: [${arr.mkString(" ")}]")
}

def concate(arr1: Array[Int],arr2: Array[Int]) : Unit ={ 
	println(s"\nArray 1: [${arr1.mkString(" ")}]")
println(s"Array 2: [${arr2.mkString(" ")}]")
println(s"Concatenated Array: [${Array.concat(arr1,arr2).mkString(" ")}]")
}
 
def main(args: Array[String]) : Unit = { 
	ques1()
ques2() 
ques3() 
ques4() 
ques5() 
pattern1(4) 
pattern2(6)
sortArray(Array(1, 10, 2, 4, 1, 2, 6, 4)) 
matrixPrint(Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))) 
populate()
concate(Array(1, 4, 10), Array(10, 7, 10, 1))
}
}
