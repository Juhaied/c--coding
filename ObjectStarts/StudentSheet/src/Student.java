
public class Student {
  public String name;
  public  double gpa;
  
  public Student() {
	  this.name = "juhaied";
	  this.gpa = 2.70;
  }
  public Student(String s) {
	  this.name = s;
	  
  }
  
  public Student(String s,double gpa) {
	  this.name = s;
	  this.gpa = 2.0;
  }
  public String getName() {
	  return name;
  }
  public void setGpa(double gpa) {
	  this.gpa = gpa;
  }
  public  double getGpa() {
	  return gpa;
  }
}
