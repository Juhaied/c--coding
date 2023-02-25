package task;

public class Faculty extends Employee {

	private String officehours;
	private String rank;
	
	public Faculty(String office,double salary,String name,String address, int num,String email,String officehours, String rank) {
	super(office,salary,name,address,num,email);
		this.officehours =officehours;
		this.rank = rank;
	}
	public void setofficehours(String officehours) {
		this.officehours = officehours;
	}
	public String getofficehours() {
		return officehours;
	}
	public void setRank(String rank) {
		this.rank = rank;
		
	}
public String getRank() {
	return rank;
}
}
