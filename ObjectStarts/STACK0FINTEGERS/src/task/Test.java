package task;

public class Test {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		for(int i = 1;i<10;i++) {
			s1.push(i);
		}
		while(!s1.empty()) {
			System.out.println(s1.pop());
			}
	
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		
		

	}

}
