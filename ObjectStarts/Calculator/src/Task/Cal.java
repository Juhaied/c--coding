package Task;

public class Cal {

	public double a;
	public double b;
	
	public Cal(double a , double b) {
		this.a = a;
		this.b = b;
	}
	public double getSum() {
		return a + b;
	}
	public double getSub() {
		return a - b;
	}
	public double getmul() {
		return a * b;
	}
	public double getDiv() {
		return a / b;
	}
	
}
