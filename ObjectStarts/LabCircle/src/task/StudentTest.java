package task;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
	
		s1.setFathersName("Md abu Bokkor");
		s1.setMothersName("Miss shahana akhter");
		s1.setAge(19);
		s1.setName("Juhu ");
		s1.setAddress("Ctg");
		s1.setGpa(2.54);
		
		System.out.println("Name = "+s1.getName() + "Father name = "+s1.getFathersName() + " Mothers name = "+s1.getMothersName() + "Age = "+s1.getAge());
	}

}
