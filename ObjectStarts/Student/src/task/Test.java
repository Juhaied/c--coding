package task;

public abstract class Test {

	public static void main(String[] args) {
		Course cse215 = new Course("Programing Language");
		cse215.addStudent("A");
		cse215.addStudent("C");
		cse215.addStudent("D");
		cse215.addStudent("E");
		String[] students = cse215.getStudents();
		
		System.out.println("Currently enrolled students: ");
		for(int i =0;i<cse215.getNoOfStudents();i++) {
			System.out.println(students[i]);
		}
		System.out.println();
		
		cse215.dropStudent("D");
		students = cse215.getStudents();
		System.out.println("Currently enrolled students: ");
		for(int i =0;i<cse215.getNoOfStudents();i++) {
			System.out.println(students[i]);
		}
		System.out.println();
	}

}
