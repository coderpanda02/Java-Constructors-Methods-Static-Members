package constructors;

//	Constructor is used to assign the initial values to the data members of the class.

//	Constructor has the same name as the class because, every class object is created
//	using the same new keyword, so it must have information about the class for which
//	it must create an object.

//	Constructor has no return type.It doesn't return any specific value which can directly 
//	affect the code like a normal method. Constructor returns the instance created by the
//	new keyword.

//	It's called constructor because it constructs the values at the time of object creation.
//	It's not necessary to write a constructor for a class, because java compiler creates
//	a default constructor if your class doesn't have any.


public class Constructor1_Return {
	
	int i;
	
	public Constructor1_Return() {
		
		System.out.println("Inside default or no-arg Constructor ->");
	}
	
	public Constructor1_Return(int i) {
		
		this.i = i;
	
		System.out.println("\nInside parameterized Constructor ->");
		System.out.println("Value assigned by constructor : "+i);
	}

	public static void main(String[] args) {
		
		//object creation, constructor returns the object 
		Constructor1_Return cr1 = new Constructor1_Return();
		
		//printing value of object, i.e. the object id
		System.out.println("Object ID for object 1 : "+cr1);
		
		//creating another object
		Constructor1_Return cr2 = new Constructor1_Return(10);
		System.out.println("Object ID for object 2 : "+cr2);

	}
}
