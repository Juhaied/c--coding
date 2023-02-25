package task;

public class Account {

	private int ac;
	private double balance;
	
	public Account(int ac,double balance) {
		this.ac = ac;
		this.balance = balance;
	}
	public Account(int ac) {
		this.ac = ac;
	}
	public int getAc() {
		return ac;
	}
	public double getBalance() {
		return balance;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void credit(double amount) {
		balance = balance + amount;
	}
	public void debit(double amount) {
		if(balance>=amount) {
			balance = balance - amount;
		}
		else {
			System.out.println("Not enough money to debit");
		}
	}
	public double yearlyAmount() {
		return  balance * 12;
	}
	public double loan(double totalAmount) {
		double loan =  totalAmount - ( totalAmount * .10);
		return loan;
	}
	public String toString() {
		return "A/C[No = "+ac + " Balance = "+balance + "$$$" +"]";
	}
}
