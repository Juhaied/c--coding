package task;

public class Football {

	private String name;
	private String xLoc;
	private String yLoc;
	private int num;
	
	public Football() {
		
	}
	public Football(String name,String xLoc,String yLoc,int num) {
		this.name = name;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.num= num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setxLoc(String xLoc) {
		this.xLoc = xLoc;
	}
	public String getxLoc() {
		return xLoc;
	}
	public void setyLoc(String yLoc) {
		this.yLoc = yLoc;
	}
	public String getyLoc() {
		return yLoc;
	}
	public void setNumber(int num) {
		this.num = num;
	}
	public int getNumber() {
		return num;
	}
	public int run() {
		int i = ++num;
		return i;
	}

	
}
