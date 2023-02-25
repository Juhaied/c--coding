package selection;
import java.util.Scanner;
public class FirstGraderSubtraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random()* 10);
		int num2 = (int)(Math.random()*10); 
		
		if(num1<num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.print("What is" + num1 + " - " + num2+ " ?" + " = ");
		int answer = input.nextInt();
		
		if( num1 - num2 == answer)
		{
			System.out.print("You are correct" +answer);
		}
		else {
			System.out.println("You are wrong");
			System.out.print(num1+ " -" + num2+ " should be" +(num1 - num2) );
		}
		

	}

}
