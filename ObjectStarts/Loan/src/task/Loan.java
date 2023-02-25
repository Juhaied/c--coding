package task;

public class Loan {
	private double annualInterestrate;
	private int numofYears;
	private double loanAmount;
	private  java.util.Date loanDate;
	
	public Loan() {
		
	}
	public Loan(double annualInterestrate, int numofYears, double loanAmount) {
		this.annualInterestrate = annualInterestrate;
		this.numofYears = numofYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	public double getannualInterestrate() {
		return annualInterestrate;
	}
	public double getloanAmount() {
		return loanAmount;
	}
	public int getNoofYears() {
		return numofYears;
	}
	public java.util.Date getDate(){
		return loanDate;
	}
	public void setannualInterestrate(double annualInterestrate) {
		this.annualInterestrate = annualInterestrate;
	}
	public void setloanamount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public void setNumofYears(int numofYears) {
		this.numofYears = numofYears;
	}
	public double getMonthlyPayment() {
		 double monthlyInterestRate = annualInterestrate / 1200; 
		 double monthlyPayment = loanAmount * monthlyInterestRate / (1- (1 / Math.pow(1 + monthlyInterestRate,  numofYears * 12)));
		 return monthlyPayment;
	}
	 public double getTotalPayment() {
		 double totalPayment = getMonthlyPayment() * numofYears * 12; 
		 return totalPayment;
	 }
	

}
