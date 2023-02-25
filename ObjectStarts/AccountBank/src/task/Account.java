package task;

public class Account {

	private int id;
	private double balance ;
	private double annualInterestrate;
	
	public Account() {
		id = 0;
		balance = 0;
		annualInterestrate= 0;
	}
	public Account(int id,double balance) {
		this.id = id;
		this.balance = balance;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setInterestRate(double balance) {
		this.annualInterestrate = annualInterestrate;
	}
	public double getInterestRate() {
		return annualInterestrate/12;
	}
	
	public double monthlyInterestRate() {
		return  balance = balance - balance * annualInterestrate/12;
	}
	public void withdrawn(int amount) {
		 balance = balance - amount;
	}
	public void Deposit(int amount) {
		 balance = balance + amount;
	}
}
