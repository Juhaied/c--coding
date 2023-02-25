package task;

public class TestMin {

	public static void main(String[] args) {
		Min m1 = new Min(500);
		
		System.out.println(m1.getSec());
		
		int m2 = m1.getSec()/60;
		int s2 = m1.getSec() % 60;
		
		System.out.println(m2+ "Minitues and reamining seconds are "+s2);;
		

	}

}
