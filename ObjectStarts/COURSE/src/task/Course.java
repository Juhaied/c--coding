package task;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void addStudent(String student) {
		students[numOfStudents++] = student;
	}
	public

}
