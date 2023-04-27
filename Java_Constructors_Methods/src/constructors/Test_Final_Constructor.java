package constructors;

//	Final keyword is used to prevent a method from getting overridden by a subclass.
//	As Constructors can't be overridden, so using final as modifier for a constructor
//	gives Illegal modifier error. Only public, protected, private are permitted
//	for a constructor.

public class Test_Final_Constructor {
	
//	public final Test_Final_Constructor() { //error -> Illegal modifier for the constructor
//												
//	}
	
	
	public Test_Final_Constructor() {
		
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Test_Final_Constructor test = new Test_Final_Constructor();
	}

}
