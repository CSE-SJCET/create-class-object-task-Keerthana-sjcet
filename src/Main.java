package demo;
class Student{
	
	public String name;
	public int rollNumber;
	public String grade;
	
	Student(){
		name="Ram";
		rollNumber=47;
		grade="S";
	}
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
    	  std.displayDetails();
        // TODO: Create a Student object and call the method to display details
    }
}
