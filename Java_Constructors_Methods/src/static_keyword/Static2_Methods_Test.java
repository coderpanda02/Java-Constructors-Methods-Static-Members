package static_keyword;

//	Static methods can only access the static members of the class, for accessing 
//	non-static members of the class, we need non-static (instance) methods.
//
//	Static variable or method should be called by the class name,
//	e.g: ClassName.staticMethod().
//
//	Testing Static and Non-Static methods and their accessibility to the
//	static and non-static members of the class ->


public class Static2_Methods_Test {
	
	int count_i = 0;
	static int count_s = 10;
	
	//static method accessing static member of a class
	public static int countNumSt() {
		count_s++;
		return count_s;
	}
	
	
	//static method accessing instance member of a class
//	public static int countNumSt2 () { //gives error - Cannot make a static reference
//		count_i++; 					// to the non-static field count_i
//		return count_i;
//	}
	
	
	//instance method accessing static member of a class
		public int countNumIns () {
			count_s++;
			return count_s;
		}
		
		
	//instance method accessing instance member of a class
	public int countNumIns2() {  
		count_i++;
		return count_i;
	}

	
	public static void main(String[] args) {
		
		Static2_Methods_Test obj = new Static2_Methods_Test();
		
		int countSt = Static2_Methods_Test.countNumSt();
		System.out.println("static member from static memthod : "+countSt);
		
		int countIns = obj.countNumIns();
		System.out.println("static member from instance memthod : "+countIns);
		
		int countIns2 = obj.countNumIns2();
		System.out.println("instance member from instance memthod : "+countIns2);
		
	}

}
