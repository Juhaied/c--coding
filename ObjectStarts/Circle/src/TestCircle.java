
public abstract class TestCircle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Circle c1 = new Circle(3.0,"blue");
		System.out.println(c1.getArea());
		
		System.out.println(c1.getCircumference(5));

		
		System.out.println("Area is = "+new Circle(9).getArea());
		
		java.util.Date date = new java.util.Date(); 
		System.out.println(date.toString());
		System.out.println(date.getTime());
	}

}
