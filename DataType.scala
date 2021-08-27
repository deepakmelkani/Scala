object DT{
	//null
	val nullReferenceVariable:String=null
	//nullReferenceVariable.length

	//Null
	val nullReferenceVariableDT:Null=null
	//nullReferenceVariableDT.length

	//Nothing
	def logException(e:Exception):Nothing ={
		println("logging Exception : %s".format(e.getMessage))
		throw new Exception("my new Exception")
	}

	//Any
	def a(x:Any)=println("Any : "+x)

	//AnyRef
	def ar(x:AnyRef)=println("AnyRef : "+x)

	//AnyVal
	def av(x:AnyVal)=println("AnyRef : "+x)

	def main(args: Array[String]):Unit={
		var a1:Boolean =true
		var a2:Byte =120
		var a3:Float =2.456227f
		var a4:Int =5
		var a5:Short =45
		var a6:Double =5.25496665532
		var a7:Char ='d'
		var a8:String ="hi,deepak"
		var a9:Long=514505461
		
		println("byte :"+a2)
		println("short :"+a5)
		println("int :"+a4)
		println("long :"+a9)
		println("float :"+a3)
		println("double :"+a6)
		println("char :"+a7)
		println("string :"+a8)
		if(a1==true)
		{
			println("boolean :"+a1)
		}
		println("Unit : hello");
		a('d')
		ar(nullReferenceVariableDT)
		av(23)
	}
}