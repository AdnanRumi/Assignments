package constructors;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("Benedict", 47, 'M', 1979, "JS", "Cybertek");
		
		Student student2 = new Student("Matilda", 7, 'F', 2029, "TS", "Cybertek");
		
		Student student3 = new Student("Olaf", 33, 'M', 1987, "J", "Cybertek");
		
		System.out.println(student1);
		
		System.out.println(student2);

		System.out.println(student3);

		
        student1.attendLecture();
        
        student1.submitAssignment();
        
        student1.attendLab();
        
        student2.attendLecture();
        
        student2.submitAssignment();
        
        student2.attendLab();
        
        student3.attendLecture();
        
        student3.submitAssignment();
        
        student3.attendLab();
		
	}

}
