package task;

public class Test {

	public static void main(String[] args) {
		Area a1 = new Area();
		
		System.out.println(a1 + "==>>"+a1.getArea());

		Area a2 = new Area(2.0);
		
		System.out.println(a2 + "===>>>"+a2.getArea());
		
		Area a3 = new Area();
		a3.setX(3);
		System.out.println(a3 + "===>>>" +a3.getArea());
		System.out.println(a3.PeriMeter());
	}

}
