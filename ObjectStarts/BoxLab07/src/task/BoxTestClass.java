package task;

public class BoxTestClass {

	public static void main(String[] args) {
		Box b1 = new Box();
		
		System.out.println("Info of Box 1 ");
		System.out.println(b1 + " volume ==>" + b1.volume());
		System.out.println();

		Box b2 = new Box(5);
		System.out.println("Info of Box 2 ");
		System.out.println(b2 + " volume ==>" + b2.volume());
		System.out.println();
		
		Box b3 = new Box(5,4,3);
		
		System.out.println("Info of Box 3 ");
		System.out.println(b3 + " volume ==>" + b3.volume());
		System.out.println();
		
		Box b4 = new Box(b3);
		
		System.out.println("Info of Box 4");
		System.out.println(b4 + " volume ==>" + b4.volume());
		System.out.println();
		
		System.out.println(" box 3 == box 4"+b4.isEqualsTo(b3));
		System.out.println("Box 2 == box 3 "+b2.isEqualsTo(b3));
	}

}
