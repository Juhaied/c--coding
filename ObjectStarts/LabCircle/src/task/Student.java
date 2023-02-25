package task;

public class Student {

	private  String name;
	private String fathersName;
	private String mothersName;
	private String address;
	private double gpa;
	private int age;
	
	public Student() {
		
	}
	public String getName() {
		return name;
	}
	public String getFathersName() {
		return fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public String getAddress() {
		return address;
	}
	public double getGpa() {
		return gpa;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFathersName(String fathersname) {
		this.fathersName= fathersName;
	}
	public void setMothersName(String mothersname) {
		this.mothersName= mothersName;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public void setGpa(double gpa) {
		this.gpa =  gpa;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name,String fathersName,String mothersName,String address,int gpa,int age) {
		this.name = name;
		this.fathersName= fathersName;
		this.mothersName= mothersName;
		this.address= address;
		this.age = age;
	}
	public String toString() {
		return "Student[Name = "+name +" Fathers Name = "+fathersName + " Mothers Name= "+mothersName + " Gpa = "+gpa + " Age = "+age +"]";
	}
}
