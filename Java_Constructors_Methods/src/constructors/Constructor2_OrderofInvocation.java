package constructors;

//	Constructors in multi-level inheritance are called in the sequence in which they 
//	are written to be inherited. That means when we are calling the bottom most level
//	Subclass's constructor, it calls the top most level Base class first,
//	then it's immediate	Subclass and so on until the bottom most level Subclass.

class A{
	
	public A() {
		System.out.println("Inside A's constructor.");
	}
}

class B extends A{
	
	public B() {
		System.out.println("Inside B's constructor.");
	}
}

class C extends B{
	
	public C() {
		System.out.println("Inside C's constructor.");
	}
}

class D extends C{
	
	public D() {
		System.out.println("Inside D's constructor.");
	}
}

public class Constructor2_OrderofInvocation {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		D d = new D(); //creating instance of D class also creates instance of
					   //A, B and C class, so it will call all the 4 constructors
					   //in the order - A() -> B() -> C() -> D()

	}

}
