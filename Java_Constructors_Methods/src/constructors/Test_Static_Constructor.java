package constructors;

// Constructor can't be static as it is called during the creation of objects, thus
// dependent on the object and not on the class like the static members of a class.

public class Test_Static_Constructor {
	
//	public static Test_Static_Constructor() { //error - Illegal modifier for the constructor 
//	
//    }
	
	public Test_Static_Constructor() { 
	
		System.out.println("Inside Constructor");
	}
	

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Test_Static_Constructor ts = new Test_Static_Constructor();
	}

}
