package task;

public class PatternPrint {

	public int i;
	public int j;
	
	public PatternPrint(int i) {
		this.i = i;
	}
	public PatternPrint(int i,int j) {
		this.i = i;
		this.j = j;
	}
	
	public void print(int i,int j) {
		for(i = 1;i<=5;i++) {
			for( j = 1;j<=5;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
