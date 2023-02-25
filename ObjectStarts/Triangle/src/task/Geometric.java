package task;

public class Geometric {
	private String color ;
	private boolean filled;
	private java.util.Date date;
	
	public Geometric() {
		color = " white ";
		filled =  false;
		date = new java.util.Date();
	}
	public Geometric(String color, boolean filled) {
		date = new java.util.Date();
		this.color = color ;
		this.filled = filled;
	}
	public String getColor() {
		return color ;
	}
	public boolean getFilled() {
		
		return filled;
	}
	public java.util.Date getDateCreated(){
		return date;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Geometric [ Color = " + color +", Filled = "+ filled + " , Date : "+date + "]";
	}
}
