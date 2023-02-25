package bmi;

public class BMI {

	private String name;
	private double weight;
	private double height;
	
	public BMI(String name,double weight,double height) {
		this.name = name;
		this.weight = weight;
		this.height= height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getBMI() {
		double bmi = weight * 0.45/(height * 0.0254*2);
		return bmi;
	}
	public String getStatus() {
		double bmi =getBMI();
		if(bmi>18 && bmi< 25) {
			return "UnderWeight";
		}
		else if(bmi>26 && bmi <29) {
			return "GOOd Bmi";
		}
		else {
			return "INvalid input";
		}
	}
	public String toString() {
		return "BMI[Name = "+name + " Weight = "+weight + "Height = "+height + "]";
	}
	
	
}
