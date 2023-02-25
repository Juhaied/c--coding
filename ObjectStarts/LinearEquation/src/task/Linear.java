package task;

public class Linear {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public Linear(double a,double b,double c,double d,double e,double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		if(a * d - b * c != 0) {
			return true;
		}
		else 
			return false;
	}
	public double getX() {
		if(isSolvable() == true) {
		double x = ((e * d) - (b * f))/((a * d) - (b * c));
		return x;
		}
		else {
			System.out.println("Not solvable");
			return -1;
		}
		
	}
	public double getY() {
		if(isSolvable() == true) {
		double x = ((a * f) - (a * c))/((a * d) - (b * c));
		return x;
		}
		else {
			System.out.println("Not solvable");
			return -1;
		}
		
	}
}
