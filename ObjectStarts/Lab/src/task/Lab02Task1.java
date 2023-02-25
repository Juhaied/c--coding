package task;
import java.util.Scanner;
public class Lab02Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		int sum = 0 ;
		System.out.println("Enter a number : ");
		int n = input.nextInt();
		while(i<=n) {
			
			sum = sum + n;
			i++;
			System.out.println("Enter a number : ");
			 n = input.nextInt();
		}
		System.out.println("Sum = "+sum);

	}

}
