package this_keyword;

//Example of passing 'this' as an argument of a constructor or a method.


class Ball_Pen {
	
//	Pen p;
//	
//	public Ball_Pen (Pen p) { //passing 'this' to constructor
//		this.p = p;
//	}
	
	public void display (Pen p) {  //passing 'this' to method
		
		System.out.println(p.num + " Ball Pens.");
	}
}


class Pen {
	
	int num;
	
	public Pen (int num) {
		
		this.num = num;
		
//		Ball_Pen b = new Ball_Pen(this);  //passing 'this' to constructor		
		Ball_Pen b = new Ball_Pen();
		
		b.display(this);  //passing 'this' to method
	}
}


public class This5_Argument {	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Pen p = new Pen(10);
		
	}

}
