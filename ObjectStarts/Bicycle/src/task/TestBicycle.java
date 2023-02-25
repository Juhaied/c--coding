package task;

public class TestBicycle {

	public static void main(String[] args) {
		Bicycle c1 = new Bicycle();
		c1.changeCadence(50);
		System.out.println(c1 + " ====>>>>");
		c1.speedUp(20);
		c1.changeGear(5);
		System.out.println(c1);
		
		Bicycle c2 = new Bicycle(5,10,20);
		
		System.out.println(c2);
		c2.changeCadence(2);
		System.out.println(c2);

	}

}
