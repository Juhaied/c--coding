
public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("Student 1 name = "+s1.name);
		System.out.println("Student 1 gpa: "+ s1.gpa);
		
		Student s2  = new Student("Juhaied");
		
		System.out.println("Student two name: "+s2.getName());
		
		s2.setGpa(3.0);
		System.out.println("Student cgpa : "+s2.getGpa());
		

		Student s3 = new Student ("juhaied hossen",3.7);
		
		System.out.println(s3.getName());
		System.out.println(s3.getGpa());
	}

}
