package task;

public abstract class Employee {
	final int FullTime = 1;
	final int PartTime = 2;
	private  int SSN;
	private int numOffEmployee;
	
	public void setSSN(int SSN) {
		this.SSN=SSN;
	}
	public Employee()
	public int getSSN() {
		return SSN;
	}
	public void setNumOfEmployee(int numOffEmployee) {
		this.numOffEmployee = numOffEmployee;
	}
	public int getnumOffEmployee() {
		return numOffEmployee;
	}
	public abstract void setSallery(int jobType);
	
	public  void printSSN() {
		System.out.println(SSN);
	}
	
}
