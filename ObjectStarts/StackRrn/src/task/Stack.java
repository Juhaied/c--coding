package task;

public class Stack {

	int tos;
	int[] stck = new int[10];
	
	public Stack() {
		tos = -1;
	}
	
	public void push(int item) {
		if(tos == 9) {
			System.out.println("Stack overflow: ");
		}
		else {
			stck[++tos] = item;
		}
		
	}
	public int pop() {
		if(tos<0) {
			System.out.println("Stack under flow: ");
			return 0;
		}
		else 
			return stck[tos--];
		
	}
	
}
