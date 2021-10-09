object string{
	def compare(str1:String ,str2:String)={
		if(str1.compareTo(str2)==0){
			println("both string are same")
		}else{
			println("string are not same")
		}
	}
	def main(args: Array[String]){
		var i:String="y";
		while(i=="y"){
			println("press 1 for compare\npress 2 for convert upper to lower case letter\npress 3 to find the index of any char\npress 4 to find the index of sub string\npress 5 for creating char array and store it into a string")
				print("enter the choice : ")
			val c:Int = scala.io.StdIn.readInt()
			if(c==1){
				var str1:String = scala.io.StdIn.readLine("enter the 1st string : ")
				var str2:String = scala.io.StdIn.readLine("enter the 2nd string : ")
				compare(str1,str2)
			}else if(c==2){
				var str1:String = scala.io.StdIn.readLine("enter the string in uppercase : ")
				println("original :"+str1)
				println("string to lower : "+str1.toLowerCase())
			}else if(c==3){
				var str1:String = scala.io.StdIn.readLine("enter the string : ")
				var index:String = scala.io.StdIn.readLine("enter the char for which u ahve to find index : ")
				println("index of "+index+" : "+str1.indexOf(index))
			}else if(c==4){
				var str1:String = scala.io.StdIn.readLine("enter the string : ")
				print("enter the index to find the substring : ")
				var index:Int = scala.io.StdIn.readInt()
				println("index of "+index+" : "+str1.substring(index))
			}else if(c==5){
				val arr = Array("d","e","e","p","a","k")
				print("array elements : ")
				for(i<-arr){
					print(i+" ")
				}
				println("\nstring : "+arr.mkString(""))
			}else{
				println("wrong choice ")
			}
			i=scala.io.StdIn.readLine("enter y/n : ")
		}
	}
}