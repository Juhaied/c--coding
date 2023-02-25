package task;

public class DriverClass {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(7,8);
		
		Line line = new Line(p1,p2);

		System.out.println(line + " Get distance  = "+line.getLength());
	}

}
