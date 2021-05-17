package class_and_Objects;

public class Employee {
	
	String name;
	
	String jobTitle;
	
	double salary;
	
	int yearsOfEmployment;
	
	
	public void work () {
		
		System.out.println(name + " has been a fine worker with us for " + yearsOfEmployment + " years.");
	}
	
	public void isOnVacation () {
		
		System.out.println(name + " is on vacation.");
	}
	
	public void introduce () {
		
		System.out.println("Name: " + name + "\t" + "Job Title: " + jobTitle + "\t" + "Salary: " + salary);
	}

}
