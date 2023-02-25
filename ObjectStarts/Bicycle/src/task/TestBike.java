package task;

public class TestBike {

	public static void main(String[] args) {
		Bike b1 = new Bike(5,2,4,6);
		
		b1.seatHeight = 7;
		
		System.out.println(b1);
		b1.seatUp(2);
System.out.println(b1);
b1.changeCadence(2);
System.out.println(b1);
b1.changeGear(3);
b1.speedUp(6);
System.out.println(b1);
	}

}
