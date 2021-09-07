object operator{
	
	/*
	1- Arithmetic Operator
	2- Relational Operator
	3- Logical Operator
	4- Bit-wise Operator
	5- Assignment Operators
	*/
	
	def arithmeticOperator():Unit = {
		var a = 50;
    	var b = 30;
		
		/*Arithmetic Operator: +, -, *, /, % */
		println("Addition of a + b = " + (a + b)); 			// Addition     
		println("Subtraction of a - b = " + (a - b));       // Subtraction
		println("Multiplication of a * b = " + (a * b));    // Multiplication
		println("Division of a / b = " + (a / b));			// Division
		println("Modulus of a % b = " + (a % b));			// Modulus
		println("=======================================")
	}
	
	def relationalOperator()= {
		var a = 50;
    	var b = 30;
		
		/*Relational Operator: ==, !=, >, <, >=, <= */    
		println("Equality of a == b is : " + (a == b));		// Equal to operator
    	println("Not Equals of a != b is : " + (a != b));   // Not equal to operator
		println("Greater than of a > b is : " + (a > b));	// Greater than operator
		println("Lesser than of a < b is : " + (a < b));	// Lesser than operator
 		println("Greater than or Equal to of a >= b is : " + (a >= b));
    	println("Lesser than or Equal to of a <= b is : " + (a <= b));
		println("=======================================")
	}
	
	def logicalOperator():Unit = {
		var c = false
    	var d = true
		
		/*Logical Operator: !(), ||, &&*/
     	println("Logical Not of !(c && d) = " + !(c && d));	// logical NOT operator
		println("Logical Or of c || d = " + (c || d));		// logical OR operator
		println("Logical And of c && d = " + (c && d));		// logical AND operator
		println("=======================================")
		
	}
	
	/* Difference between bitwise and logical operators
	1- && [only Boolean [true/false]], whereas & [short, int, unsigned, char, bool, unsigned char, long]
	2- && [0:false, 1=true], whereas & [0=int, 1= int]
	3- a && b : would not evaluate second operand if 1st one is false
	   a & b  : evaluate both operands
	*/
	
	def bitwiseOperator():Unit = {
		
		
    	var a:Int = 20;
    	var b:Int = 18;
    	var c:Int = 0;
    
		/*Bit-wise Operator: &, |, ^, ~, <<, >>, >>>*/
		c = a & b;
		println("Bitwise And of a & b = " + c); // Bitwise AND operator
		
		
		/*
		num -> binary -> opr [bitwise]
		00000001 = 1
		00000001 = 1
		------------
		00000001
		------------
		*/
 
    	c = a | b;
    	println("Bitwise Or of a | b = " + c);	// Bitwise OR operator
        	
		c = a ^ b;
		println("Bitwise Xor of a ^ b = " + c);	// Bitwise XOR operator
	
		/*
		1 ^ 1 = 0
		0 ^ 0 = 0
		1 ^ 0 = 1
		0 ^ 1 = 1
		*/
		
		c = ~a;
		println("Bitwise Ones Complement of ~a = " + c); // Bitwise once complement operator
		
		/*
		00000001 -> 1111110
		*/
		
		c = a << 3;
		println("Bitwise Left Shift of a << 3 = " + c);	// Bitwise left shift operator
		/*
		3 = 00000011<-
		<<3 : 00011000
		<<3 : 0	  0	 0	1  1 0 0 0
		      128,64,32,16,8,4,2,1
		*/
		
		c = a >> 3;
		println("Bitwise Right Shift of a >> 3 = " + c);	// Bitwise right shift operator
		
		/*
		->10000011
		1000000
		*/
		
		c = a >>> 4;
		println("Bitwise Shift Right a >>> 4 = " + c);		// Bitwise shift right zero fill operator
		
		
		/*Difference between << and <<<
		- The >> operator preserves the sign (sign-extends), while >>> zeroes the leftmost bits (zero-extends).
		*/
		
		println("=======================================")
	}
	
	def assignmentOperators():Unit = {
		
		
		var a = 50;
    	var b = 40;
    	var c = 0;
		
		/*Assignment Operators: +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |=*/
    	c = a + b;
    	println("simple addition: c= a + b = " + c);		// simple addition
		c += a;
    	println("Add and assignment of c += a = " + c);		// Add AND assignment
		
		c -= a;
    	println("Subtract and assignment of c -= a = " + c);// Subtract AND assignment
		
		c *= a;
    	println("Multiplication and assignment of c *= a = " + c);// Multiply AND assignment
     
		c /= a;
    	println("Division and assignment of c /= a = " + c);// Divide AND assignment
     
		c %= a;
    	println("Modulus and assignment of c %= a = " + c);// Modulus AND assignment
		
		c <<= 3;
    	println("Left shift and assignment of c <<= 3 = " + c);// Left shift AND assignment
     
		c >>= 3;
    	println("Right shift and assignment of c >>= 3 = " + c);// Right shift AND assignment
     
    	c &= a;
    	println("Bitwise And assignment of c &= 3 = " + c);// Bitwise AND assignment
    	
     	c ^= a;
    	println("Bitwise Xor and assignment of c ^= a = " + c);// Bitwise exclusive OR and assignment
     
    	c |= a;
    	println("Bitwise Or and assignment of c |= a = " + c);// Bitwise inclusive OR and assignment
		
		println("=======================================")
	}
	
		
	def main(args: Array[String]): Unit = {
		
		arithmeticOperator()
		relationalOperator()
		logicalOperator()
		bitwiseOperator()
		assignmentOperators()
		
	}	
}