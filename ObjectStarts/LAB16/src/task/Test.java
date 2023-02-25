package task;

public class Test {

	public static void main(String[] args) {
		Faculty f1 = new Faculty(123,"Nabid",19,"jhn",2000,200);
		System.out.println(f1);
		System.out.println(f1.yearlyIncome());
		System.out.println(f1.yearlyIncomeTax());

	}

}
