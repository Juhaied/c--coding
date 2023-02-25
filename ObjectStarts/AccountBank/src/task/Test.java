package task;

public class Test {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setId(1122);
		a1.setBalance(20000);
		a1.setInterestRate(4.5);
		a1.withdrawn(2500);
		a1.Deposit(3000);
		System.out.println("Balance = "+a1.getBalance());
System.out.println("MothlyInterest = "+a1.monthlyInterestRate());
System.out.println(a1.getInterestRate());
System.out.println(System.currentTimeMillis());
	}

}
