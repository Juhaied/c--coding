package loop;
import java.util.Scanner;
public class AdditionQuiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);

		System.out.print("What is " + num1 + " + " +num2 + " = ");
		int answer = input.nextInt();
		
		while(num1+num2 != answer)
		{
			System.out.print("Wrong answer.Try again.What is "+num1+ " + "+ num2 + " = ");
			answer = input.nextInt();
		}
		System.out.print("You got it right"+num1+ " + "+num2+ " = "+answer);
	}

}
