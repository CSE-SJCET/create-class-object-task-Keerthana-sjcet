class Student{
	
	String name;
	int rollNumber;
	char grade;
	
	
	
	public void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollNumber);
		System.out.println("Grade: "+grade);
	}
	
	// TODO: Create a method to display student details
}
public class Main {
      public static void main(String[] args) {
    	  Student std=new Student();
    	  
    	  
		  std.name="Ram";
    	  std.rollNumber=47;
    	  std.grade='S';
    	  
    	  std.displayDetails();
        // TODO: Create a Student object and call the method to display details
    }
}
