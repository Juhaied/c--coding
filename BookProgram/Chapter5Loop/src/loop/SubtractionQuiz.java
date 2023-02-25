package loop;
import java.util.Scanner;
public class SubtractionQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		int temp;
		if(num1<num2)
		{
			 temp=num1;
			num1= num2;
			num2 = temp;
		}
		int answer = 0;
		while(answer != num1 - num2) {
			
			System.out.print("What is "+num1 + " - " +num2 + " = ");
			 answer = input.nextInt();
			answer = input.nextInt();
			System.out.print("What is "+num1 + " - " +num2 + " = ");
			answer = input.nextInt();
		}
		System.out.print("Your answer is correct");
	}

}
