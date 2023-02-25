package task;

public class Student extends Person {

	private String status;
	
	public Student(String status,String name,String address, int num,String email) {
		super(name,address,num,email);
		this.status = status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
}
