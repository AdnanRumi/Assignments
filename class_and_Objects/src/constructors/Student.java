package constructors;

public class Student {
	
	String name;
	
	int age;
	
	char gender;
	
	int year;
	
	String course;
	
	String university;
	
	public void attendLecture() {
		
		System.out.println(name + " has attended all lectures.");
		
	}
	
	public void submitAssignment() {
		
		System.out.println(name + " has submitted all assignments on time.");

	}
	
	public void attendLab() {
		
		System.out.println(name + " has attended all labs.");

	}

	public Student(String name, int age, char gender, int year, String course, String university) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", year=" + year + ", course=" + course
				+ ", university=" + university + "]";
	}
	

}
