package task;

public class Course {

	private String courseName;
	private String[] students;
	private int noofStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
		students = new String[3];
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getNoOfStudents() {
		return noofStudents;
	}
	
	public String[] getStudents() {
		return students;
	}
	public void addStudent(String student) {
		if(noofStudents == students.length) {
			String[] temp = new String[noofStudents * 2];
			for(int i = 0; i < noofStudents; i++) {
				temp[i] = students[i];
			}
			students = temp;
		}
	}
}
