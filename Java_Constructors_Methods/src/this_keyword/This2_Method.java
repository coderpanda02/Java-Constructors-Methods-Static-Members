package this_keyword;

//	'this' keyword can be used to refer to the current class object.
//	It can be used to access the instance methods of the current class.
//		eg. : this.display()

public class This2_Method {

	int i = 10;
	
	public void display1() {
		
		System.out.println("Inside display1");
		System.out.println("i = "+this.i);
	}
	
	public void display2() {
		
		System.out.println("\nInside display2");

		this.display1(); //referring to current objects display1 method
	}
	
	public static void main(String[] args) {
		
		This2_Method obj = new This2_Method();
		obj.display1();
		obj.display2();
		
	}

}
