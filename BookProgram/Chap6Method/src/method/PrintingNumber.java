package method;
import java.util.Scanner;
public class PrintingNumber {

	public static int printNum(int num) {
		int numbers = 1;
		for(int i = 1;i<=num;i++)
		{
			System.out.print(i);
		}
		return numbers;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		int num = input.nextInt();
		
		int print = (printNum(num));
		

	}

}
