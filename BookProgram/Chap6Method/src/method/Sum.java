package method;
import java.util.Scanner;
public class Sum {

	public static int getSum(int num) {
		int sum = 0;
		for(int i = 1;i<=num;i++) {
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
		int num =input.nextInt();
		
		int result = (getSum(num));
		
		System.out.print(result);
		
		

	}

}
