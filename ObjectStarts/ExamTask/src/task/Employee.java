package task;

public abstract class Employee {
	private int SSN;
	public int Salary;
	private int NumberofEmployees;
	
	

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int SSN) {
		this.SSN = SSN;
		this.NumberofEmployees++;
	}

	public abstract void setSalary(int jobtype);
	
	
	void printSSN() {
		System.out.println("Social Security Number: " + SSN + "\nNumbers of Employees:" + NumberofEmployees);
		System.out.println();
	}

	public int getNumberofEmployees() {
		return NumberofEmployees++;
	}
	
	public boolean compareEmployees(Employee employee) {
		
		if(this.SSN == employee.SSN) {
			return true;
		}
		else 
		return false;
	}

	
	
}
