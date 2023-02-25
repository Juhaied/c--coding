package task;

public class Employee extends Person{

	private String office;
	private double salary;
	private java.util.Date hiredDate;
	
	public Employee(String office,double salary,String name,String address, int num,String email) {
		super(name,address,num,email);
		this.office = office;
		this.salary = salary;
		hiredDate = new java.util.Date(2017, 6, 6, 7, 45, 27);
	}
	
	public void setoffice(String office) {
		this.office =office ;
	}
	public String getoffice() {
		return office;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public java.util.Date getHiredDate(){
		return hiredDate;
	}
	public String toString() {
		return "Employee[ Name = "+getName() + " Address = "+getAddress() + " , Num = "+getNum() + " ,Email = "+getEmail() + " Office = "+office + " salary = "+salary +"]";
	}
}
