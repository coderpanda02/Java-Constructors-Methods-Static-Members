package static_keyword;

//	super can't be used in static context, because super refers to the object of
//	the superclass, this implies that to use 'super' the method should be invoked
//	by an object, so it is related to objects not class and Static members are
//	class level members, so they can't access the instance members

class A {
	
	public void displayA () {
		System.out.println("Inside non-static displayA() of class A");
	}
}

class B extends A {
	
	public void displayB() {
		super.displayA();
		System.out.println("Inside non-static displayB() of class B");
	}
	
	public static void displayBS () {
//		super.displayA();  //gives error can't use super in static context
		System.out.println("\nInside static displayBS() of class B");
	}
} 


public class Static3_Methods_Super {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.displayB(); //calling the non-static method
		
		B.displayBS();  //calling the static method

	}

}
