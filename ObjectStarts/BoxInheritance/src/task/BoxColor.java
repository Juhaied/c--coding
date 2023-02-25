package task;

public class BoxColor extends BoxWeight {
private String color;
public BoxColor(double height,double width,double depth,double weight,String color) {
	super(height,width,depth,weight);
	this.color = color;
}
public void setColor(String color) {
	this.color = color;
}
public String getColor(){
	return color;
}
public String toString(){
	return "BoxColor[ Color = "+color + " Height = "+getHeight() + " Depth = "+getDepth() + " Width = "+getWidth() + "]";
}
}
