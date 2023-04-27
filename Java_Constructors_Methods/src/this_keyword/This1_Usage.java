package this_keyword;

//	'this' keyword can be used to refer to the current class object. It is used
//	to access the instance variable, instance method, or constructor of a class. 
//	'this' is instance related, so it can't be used in a static context or 
//	to refer to the static members of a class.
//
//	In case of variables, if there is ambiguity between the instance variable 
//	and the parameter of a constructor or method while setting values for the
//	instance variables, 'this' keyword resolves the problem.
//
//	Different names can also be used for the variables and the parameters
//	when not using 'this'.
//		eg. : 
//			String name = null;
//			public void setName (String name) {
//				this.name = name;
//			}


public class This1_Usage {
	
	//int num; //using different variable name
	int i;
		
	public This1_Usage(int i) {
		
//		num = i; //without 'this', when using different variable name
		
//		i = i; //compiler gives warning - The assignment to variable i has no effect
		
		this.i = i; //refers to current object's instance variable
		
	}

	public static void main(String[] args) {
		
		This1_Usage obj = new This1_Usage(10);
		
//		System.out.println(this.i); //error - can't use 'this' in a static context
		
		System.out.println(obj.i); //in case of i = i, it will print 0
		
	}

}
