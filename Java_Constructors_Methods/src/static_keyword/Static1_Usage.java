package static_keyword;

//	Static members are class related, not dependent on objects. The value for static
//	members remain throughout the whole program. They can be accessed anywhere within
//	the class and no object creation is needed to call the static members. 
//
//	There are static members like, static block, variable or method.
//	The memory allocation for static variables and methods are done in the Linking 
//	process of the ClassLoader. Static variables are initialized and static blocks are
//	executed in the next step, i.e. Initialization process of the ClassLoader.
//
//	Java main method is static as main is the first method to be executed following  
//	the static block (if any present) in a program before the object creation.


public class Static1_Usage {
	
	//static block - executed first in a program, before the main method 
	//at the time of class loading. 	
	static {

		System.out.println("Executing static block.");
	}
	
	
	//initializing static variable
	static int i = 0;
	
	//initializing instance variable
	int j = 0;
	
	
	public static void main(String[] args) {
		
		Static1_Usage obj = new Static1_Usage();
		
//		static int i = 0; //gives error - illegal modifiers, as when initializing 
//		static variable inside static block or method, no need to add 'static',
//		initializing outside the static block, have to add 'static'
	
		
//		int j = 0; //local variable j
		
		for(int count=1; count<=3; count++) {
			
			System.out.println("\nIteration "+count+" : ");
			
			System.out.println("value of static variable i = "+i);
			i++;
			
//			System.out.println("value of instance variable j = "+j); //gives error -
			//Cannot make a static reference to the non-static field j, when j is
			//defined outside the main method, have to call it by the instance, obj.j
			
			System.out.println("value of instance variable j = "+obj.j);
			obj.j++;
		}
		
	}

}
