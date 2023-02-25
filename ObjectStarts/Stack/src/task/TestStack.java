package task;

public class TestStack {

	public static void main(String[] args) {
		Stack n1 = new Stack();
		
		for(int i = 1;i<=9;i++)
			n1.push(i);
		
		System.out.println("Stack one content");
		for(int i = 1;i<9;i++)
			System.out.println(n1.pop());
		
		Stack n2 = new Stack();
		
		for(int i = 10;i<=19;i++)
			n2.push(i);
		
		System.out.println("Content of Stack2");
for(int i = 10;i<19;i++)
	System.out.println(n2.pop());

         Stack n3 = new Stack();
         
         for(int i=15;i>=6;i--)
        	 n3.push(i);

 		System.out.println("Content of Stack3");
         for(int i=15;i>=6;i--)
        	 System.out.println(n3.pop());
         


	}

}
