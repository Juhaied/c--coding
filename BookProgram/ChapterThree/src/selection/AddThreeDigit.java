package selection;
import java.util.Scanner;
public class AddThreeDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		int num3 = (int)(Math.random()*10);
		
		System.out.print("What is"+num1+ " + "+ num2+ " + " +num3 + " = ?");
		int answer=input.nextInt();
		
		System.out.print(+num1 + " + " + num2 + " + " + num3+ " = " +(num1 + num2 + num3==answer));

	}

}
