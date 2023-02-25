package task;

public class TestLoan {

	public static void main(String[] args) {
		Loan l1 = new Loan(2.5,5,1000);
		System.out.println(l1.getMonthlyPayment());
System.out.println(l1.getTotalPayment());
System.out.println(l1.getDate());
	}

}
