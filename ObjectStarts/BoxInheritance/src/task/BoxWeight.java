package task;

public class BoxWeight extends Box {
	private double weight;
	
	public BoxWeight(double height,double width,double depth,double weight) {
		super(height,depth,width);
		this.weight = weight;
	}
	public void setWeight(double weight) {
		this.weight =weight;
	}
	public double getWeight() {
		return weight;
	}
	public double area() {
		return weight + super.getVoloume();
	}
	public String toString() {
		return "BoxWeight[ Weight = "+weight + " Height = "+getHeight() + " Depth = "+getDepth() + " Width = "+getWidth() + "]";
	}

}
