package task;

public class Test {

	public static void main(String[] args) {
		Stock s1 = new Stock("Milk","Dano");
	s1.curPrice = 35;
	s1.prePrice = 30;
	System.out.println("Percentage : "+s1.percentage());

	}

}
