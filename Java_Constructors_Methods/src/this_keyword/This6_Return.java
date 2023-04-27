package this_keyword;

//example of proof that 'this' returns the current object

public class This6_Return {
	
	public This6_Return getObject() {
		
		return this;
	}

	public static void main(String[] args) {
		 
		This6_Return obj = new This6_Return();
		
		System.out.println("Printing object id : "+obj);
		
		System.out.println("\nPrinting object id using 'this' : "+obj.getObject());
	}

}
