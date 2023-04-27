package methods;

//Methods are used to define the behavior of an object.
//Two types of methods ->
//1. Accessors or getter methods : used to read the variables and return the value
//		-> named with 'get' prefix, ex. : public int getValue()
//2. Mutators or setter methods : used to read and modify values, returns nothing. 
//		-> named with 'set' prefix, has parameters, ex. : public void setValue(int i)

//Method parameters can be of two types ->
//1. Actual Parameter : They are the values that are passed to the function when
//						it is invoked. They are passed by the calling function. 
//2. Formal Parameter :	The Formal Parameters are the variables defined by the 
//						function that receives values when it is called.


public class Method_Usage {
	
	int i = 10;
	static int j = 50;
	
	private int getValue_i() {
		return i;
	}
	
	private int getValue_j() {
		return j;
	}

	private void setValue_i(int i) { 
		this.i = i;
	}
	
	private static void setValue_j(int j) {		
		Method_Usage.j = j;
	}

	
	public static void main(String[] args) {
		
		Method_Usage m = new Method_Usage();
		
		System.out.println("Initial Value : i="+m.getValue_i()+" j="+m.getValue_j());

		m.setValue_i(20);
		setValue_j(60);
		
		System.out.println("Final Value : i="+m.getValue_i()+" j="+m.getValue_j());

	}

}
