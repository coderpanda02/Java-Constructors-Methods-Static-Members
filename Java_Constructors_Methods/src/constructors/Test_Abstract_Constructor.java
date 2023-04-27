package constructors;

//Abstract methods need to be overridden and defined by the child class but 
//constructors can't be overridden thus, constructors can't be abstract

public class Test_Abstract_Constructor {
	
//	public abstract Test_Abstract_Constructor() {//error - Illegal modifier for constructor
//		
//	}
	
	public Test_Abstract_Constructor () {
		
		System.out.println("Inside constructor");
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Test_Abstract_Constructor t = new Test_Abstract_Constructor();
		
	}

}
