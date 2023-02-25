package bankaccount;

public class SuperBankTest {

	public static void main(String[] args) {
		SuperBank one = new SuperBank("Neeha",834,30.9,"Chawkbzr");
System.out.println(one);
one.credit(230);
one.Debit(124);
System.out.println(one);
	}

}
