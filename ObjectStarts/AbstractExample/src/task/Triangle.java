package task;

public class Triangle extends Figure {

	public Triangle(double a,double b) {
		super(a,b);
		}
	
	public double area() {
		return (dim1 * dim2)/2;
	}
	}

