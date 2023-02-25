package TASK;
import java.util.Scanner;
public class Subtraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1 = (int)(Math.random() * 10);
		
		int n2 = (int)(Math.random() * 10);
		
		if (n2 >=n1) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println("What is "+n1 + " - "+n2 + " = ?");
		int answer = input.nextInt();
		
		if(n1 - n2 == answer) {
			System.out.println("you are correct ");
		}
		else {
			System.out.println(n1 + " - "+n2 + " should be "+(n1-n2));
		}
	}

}
