package methods;

//	There are 2 types of method call ->
//
//	   1. Call By Value : Passing a copy of the variable.
//			    -> It doesn't change the actual value.
//	   2. Call By Reference (or Object) : Passing a reference of the object (i.e the variable through which the object can be accessed).
//					    -> It changes the actual value.
//
//	The parameters passed to method are called Actual parameters and the parameters received by method are called Formal parameters.
//
//	In case of Call by value, values of actual parameter are copied to the formal parameter where both the parameters are stored in different memory locations.  
//	So, any changes made inside the method being called are not reflected in actual parameters of the caller method.
//
//	But, for Call by reference, both actual and formal parameters refer to the same memory location. So, any changes made inside the method being called are 
//	actually reflected in the actual parameters of the caller method.



public class CallBy_Value_Object {
	
	int data = 10; //instance variable data
	
	//call by object reference - data getting changed -> obj.data
	public void changeByRef(CallBy_Value_Object obj) {
		obj.data = obj.data + 100;
	}
	
	
	//call by value - data getting changed -> value in method (local change)
	public void changeByVal(int value) {
		 value = value + 100;
		 System.out.println("Value after change (+100) inside the method for "
		 					+ "'call by value' : "+value);
	}
	
	
	public static void main(String[] args) {
		
		CallBy_Value_Object obj = new CallBy_Value_Object();
		
		//call by value
		int value = 20;
		System.out.println("Value before change by 'Call by value' : "+value);
		obj.changeByVal(value); //passing value through the method (call by value)
		System.out.println("Value after change (+100) outside the method for"
							+ " 'Call by value' : "+value);
		System.out.println();

		
		//call by object reference
		System.out.println("Value before change by 'Call by object reference' : "
							+obj.data);
		obj.changeByRef(obj);
		System.out.println("Value after change (+100) by 'Call by object reference' : "
							+obj.data);
		
		
	}

}
