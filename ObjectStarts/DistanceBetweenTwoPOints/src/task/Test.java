package task;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(3,4);
		
		Line l1 = new Line(p1,p2);
		
		System.out.println(l1 + "====>>>>"+l1.getLength());

		Line line2 = new Line(1,2,7,8);
		System.out.println(line2.getLength());
	}

}
