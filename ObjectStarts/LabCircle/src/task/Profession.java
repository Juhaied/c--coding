package task;

public class Profession extends Student {

	String profession;
	
	public Profession(String name,String fathersName,String mothersName,String address,int gpa,int age,String profession) {
		super(name,fathersName,mothersName,address,gpa,age);
		this.profession = profession;
	}
	
	public String toString() {
		return " Profession[ Name = "+getName() + "Profession = "+profession + "]";
	}
}
