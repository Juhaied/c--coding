package task;

public class Overload {

	public static void main(String[] args) {
		OverLoadingDemo t1 = new OverLoadingDemo();
		t1.Test();
		
		OverLoadingDemo t2 = new OverLoadingDemo();
		t2.Test(5);
		
		OverLoadingDemo t3 = new OverLoadingDemo();
		t3.Test(5,15);
		
		OverLoadingDemo t4 = new OverLoadingDemo();
		double result = t4.Test(5.0, 7.0);
		System.out.println(result);

	}

}
