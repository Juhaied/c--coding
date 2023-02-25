package loop;
import java.util.Scanner;
public class GuessingNUmber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = (int)(Math.random()*101);
		
		int guess = 0;
		
		while(guess != number) {
			System.out.print("Enter your guess: ");
			guess = input.nextInt();
			
			if(guess== number) {
				System.out.println("Your guess is right"+number);
			}
			else if(guess>number){
					System.out.println("Your guess is very high");
				
			}
			else {
				System.out.println("Your answer is very low")	;
			}
		}

	}

}
