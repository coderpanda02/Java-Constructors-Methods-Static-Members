package this_keyword;

//	'this' keyword refers to the current class object. 
//
//  'this' is only applicable where an object is created, so it's related to objects. 
//	But static members are class level members, so can't access the instance members.
//	Thus, 'this' can't be used in a static context.



public class This7_Static_Test {
	
//	public static This7_Static_Test getObj () {	
//		return this; //gives error as 'this' can't be used in static context
//	}
	
	public This7_Static_Test getObj () {
		
		return this;
	}

	
	public static void main(String[] args) {
		
		This7_Static_Test obj =  new This7_Static_Test();
		
		System.out.println("Class Name : "+ obj.getClass());

//		System.out.println("Object id : "+ this.getObj); //gives error
		System.out.println("Object id : "+ obj.getObj());
	}

}
