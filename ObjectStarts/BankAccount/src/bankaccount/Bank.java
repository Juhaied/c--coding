package bankaccount;

public class Bank {
	private String name;
	private int idNo;
	private double balance;
	
	public Bank() {
		name = "nabid";
		idNo = 6281;
		balance = 0;
	}
	public Bank(String name, int idNo,double balance) {
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int idNo) {
		this.idNo = idNo;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return idNo;
	}
	public double getBalance() {
		return balance;
	}
	public void credit(int amount) {
		balance = balance + amount;
	}
	public void Debit(int amount) {
		if(amount<= balance) {
		balance = balance - amount;
		}
		else {
			System.out.println("Dont have sufficient money");
		}
	}
	public String toString() {
		return "Bank[Accounter Name = "+name + ",Id No = "+idNo + ",Balance in your account = "+balance +"]"; 
	}

}
