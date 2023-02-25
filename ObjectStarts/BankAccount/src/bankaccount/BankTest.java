package bankaccount;

public class BankTest {

	public static void main(String[] args) {
		Bank ac1 = new Bank();
		System.out.println("Accounter one information");
		System.out.println();
		ac1.setBalance(200);
		ac1.setId(124);
		ac1.setName("Nabid");
		ac1.Debit(20);
		System.out.println(ac1);
		System.out.println();
		
		
		Bank ac2 = new Bank("Juhu",432,523.0);
		System.out.println("ACoounter two information");
		System.out.println();
		System.out.println(ac2);
		ac2.credit(27);
		System.out.println(ac2);
		ac2.Debit(100);
		System.out.println(ac2);
		
		
		

	}

}
