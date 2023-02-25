package task;

public class Person {

	private String name;
	private String address;
	private int num ;
	private String email;
	
	public Person(String name,String address, int num,String email) {
		this.name = name;
		this.address = address;
		this.num = num;
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNum(int num) {
		this.num = num;;
	}
	public void setEmail(String email) {
		this.email = email;;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getNum() {
		return num;
	}
	public String getEmail() {
		return email;
	}
	
}
