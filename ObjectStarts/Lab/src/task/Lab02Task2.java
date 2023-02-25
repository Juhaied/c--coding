package task;
import java.util.Scanner;
public class Lab02Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Operator : ");
		char ch = input.next().charAt(0);
		
		System.out.println("Enter 1st operand : ");
		int n1 = input.nextInt();
		System.out.println("Enter 2nd operand : ");
		int n2 = input.nextInt();
		
		switch(ch) {
		case '+':
			System.out.println("Result is = "+(n1 + n2));
			break;
		case '-':
			System.out.println("Result is = "+(n1 - n2));
			break;
		case '*':
			System.out.println("Result is = "+(n1 * n2));
			break;
		case '/':
			System.out.println("Result is = "+(n1 / n2));
			break;
		case '%':
			System.out.println("Result is = "+(n1 % n2));
			break;
			default:
				System.out.println("Invalid operator");
		}
		

	}

}
