package task;

public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account(123,500);
		System.out.println("Accounter one data");
		System.out.println(a1);
	
		System.out.println(a1);
		System.out.println("Yearly taka = "+a1.yearlyAmount());
		System.out.println("After clearing loan taka = "+a1.loan(6000));
	}

}
