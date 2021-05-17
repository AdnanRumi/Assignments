package class_and_Objects;

public class EmployeeInstance {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		
		Employee employee2 = new Employee();
		
		Employee employee3 = new Employee();
		
		employee1.name = "Hans";
		
		employee2.name = "Isabel";
		
		employee3.name = "Clara";
		
		employee1.jobTitle = "Regional manager";
		
		employee2.jobTitle = "Manager";
		
		employee3.jobTitle = "Chaplain";
		
		employee1.yearsOfEmployment = 19;
		
		employee2.yearsOfEmployment = 17;
		
		employee3.yearsOfEmployment = 11;
		
		employee1.salary = 5555;
		
		employee2.salary = 4444;
		
		employee3.salary = 6666;
		
		employee1.introduce();
		employee1.work();
		employee1.isOnVacation();
		
		employee2.introduce();
		employee2.work();
		employee2.isOnVacation();
		
		employee3.introduce();
		employee3.work();
		employee3.isOnVacation();

	}

}
