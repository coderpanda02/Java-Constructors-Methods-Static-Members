package this_keyword;


//	this keyword is used to refer to the current object in a class.
//	It can be used to access the constructor of the current class and to reuse
//	the constructor ( for constructor chaining ).

//	Call to this() must be the first statement in constructor.
 
//	Example of using 'this' to call the parameterized constructor from the 
//	non-parameterized one and vice versa.

public class This3_Constructor {

	public This3_Constructor() {
		
		this("java"); //calling the parameterized constructor This3_Constructor(String string)
		
		//the line above gives error - Recursive constructor invocation, when both
		//this("java") and this() in This3_Constructor(String string) are called together
		
		System.out.println("Inside No arg constructor\n");
	}
	
	
	public This3_Constructor(String string) {
		
//		this(); //calling the No arg constructor This3_Constructor()
		
		//the line above gives error - Recursive constructor invocation, when both
		//this() and this("java") in This3_Constructor() are called together
		
		System.out.println("Inside parameterized constructor : string = "+string);
	}


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		This3_Constructor t1 = new This3_Constructor();
		This3_Constructor t2 = new This3_Constructor("args");
	}

}
