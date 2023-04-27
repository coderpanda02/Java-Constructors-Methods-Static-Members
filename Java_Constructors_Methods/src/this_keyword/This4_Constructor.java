package this_keyword;

// Example of reusing constructor using 'this' keyword for re-usability of code.


class Student {
	
	String firstName;
	String lastName;
	int age;
	
	public Student (String firstName, String lastName) { 
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public Student (String firstName, String lastName, int age) {
		
//		this.firstName = firstName;
//		this.lastName = lastName;
		
//		instead of this, we can reuse the previous constructor for re-usability of code.

		this(firstName, lastName);
		this.age = age;
		
	}	
	
	public void display () {
		
		System.out.println("Name = "+firstName+" "+lastName+"  Age = "+age);
	}
}


public class This4_Constructor {

	public static void main(String[] args) {
		 
		Student st1 = new Student("Ajay", "Sen", 15);
		st1.display();
		
		Student st2 = new Student("Bidisha", "Roy", 16);
		st2.display();
	}
}
