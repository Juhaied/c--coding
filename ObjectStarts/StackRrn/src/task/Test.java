package task;

public class Test {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		System.out.println("Elements in stack");
		for(int i= 1;i<10;i++) {
			s1.push(i);
		}
		for(int i = 1;i<10;i++) {
			System.out.println(s1.pop());
		}
	}

}
