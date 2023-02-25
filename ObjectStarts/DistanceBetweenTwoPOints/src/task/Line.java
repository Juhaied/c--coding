package task;

public class Line {
	private Point start;
	private Point end;
	
	public Line(Point start,Point end) {
		this.start = start;
		this.end = end;
	}
	public Line(int x1,int y1,int x2,int y2) {
		start = new Point(x1,y1);
		end = new Point(x2,y2);
	}
	public Point getStart() {
		return start;
	}
	public Point getEnd() {
		return end;
	}
	public void setStart(Point Start) {
		this.start = start;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	public double getLength() {
		int a1 = start.getX() - end.getX();
		int a2 = start.getY() - end.getY();
		double rslt = Math.sqrt(a1 * a1 + a2 * a2);
		return rslt;
	}
	public String toString() {
		return "Line[ Start = "+start.getX() +","+start.getY() + " End = "+end.getX() +"," +end.getY() + "]";
	}

}
