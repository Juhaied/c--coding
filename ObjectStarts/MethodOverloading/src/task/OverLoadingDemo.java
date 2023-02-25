package task;

public class OverLoadingDemo {

	public void Test() {
		System.out.println("no parameters");
	}
	public void Test(int a) {
		System.out.println("a = "+a);
	}
	public void Test(int a ,int b) {
		int c = a + b;
		System.out.println(" c = "+c);
	}
	public double Test(double a ,double b) {
		
		return a * b;
	}
}
