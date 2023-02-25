package task;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction() {
		 numerator = 0;
		 denominator = 0;
	}
	public Fraction(int numerator,int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public void setDinominator(int denominator) {
		this.denominator =denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public int denominator() {
		return denominator;
	}
	public void add(Fraction fraction) {
		 this.numerator = (numerator * fraction.denominator) +( denominator * fraction.numerator);
		this.denominator =fraction. denominator * denominator;
	}
	public String toString() {
		return "Fraction[ " + numerator + "/" + denominator + "]";
	}
}
