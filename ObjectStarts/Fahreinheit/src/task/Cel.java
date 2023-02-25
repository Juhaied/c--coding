package task;

public class Cel {

	private double c;
	private double f;
	
	public Cel(double c) {
		this.c = c;
	}
	
	public void setCel(double c) {
		this.c = c;
	}
	public void setfah(double f) {
		this.f = f;
	}
	public double getCel() {
		return c;
	}
	public double getfah() {
		return f;
	}
	public double getFah() {
		return 1.8 * c + 32;
	}
	public double getcel() {
		return (f-32) * 1/1.8;
	}
	
}
