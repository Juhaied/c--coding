package selection;
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//generating a two digit random number;
		
		int lottery = (int)(Math.random()* 100);
		
		int lotteryDigit1 = lottery % 10;
		int lotteryDigit2 = lottery / 10;
		System.out.print("Enter your guess: ");
		int guess = input.nextInt();
		int guessDigit1 = guess%10;
		int guessDigit2 = guess/10;
		
		System.out.println("Lootery number is "+lottery);
		
		if(lottery == guess)
		{
			System.out.print("Exact match!!!! You win 10000");
		}
		else if(lotteryDigit1 ==guessDigit2 && lotteryDigit2 == guessDigit1 )
		{
			System.out.print("Congrats you win 3000");
		}
		else if(lotteryDigit1 ==guessDigit1 || lotteryDigit1 ==guessDigit2 || lotteryDigit2 == guessDigit1 ||lotteryDigit2==guessDigit2)
		{
			System.out.print("Congrats you win 1000");
		}
		
		else {
			System.out.print("Numbers doesnot match");
		}
			

	}

}
