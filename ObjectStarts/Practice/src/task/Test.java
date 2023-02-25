package task;

public class Test {

	public static void main(String[] args) {
	Box b1 = new Box(5,4,3);
	Box b2 = b1;
	System.out.println(b1 + "=====>>>>>" +b1.getVolume());
	System.out.println(b2 + "=====>>>>"+b2.getVolume());

	b2.setheight(6);
	b2.setLength(5);
	b2.setWidth(5);
	System.out.println("After change");
	System.out.println();
	System.out.println(b1 + "=====>>>>>" +b1.getVolume());
	System.out.println(b2 + "=====>>>>"+b2.getVolume());
	System.out.println("b1 == b2 "+b1.isEqualsto(b2));
	}

}
