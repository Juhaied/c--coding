package task;

public class Test {

	public static void main(String[] args) {
		BoxClass b = new BoxClass(5,7,8);
		
		System.out.println("Area = "+b.volume());
		
		BoxClass b2 = new BoxClass(4);
		System.out.println(b2.volume());

	}

}
