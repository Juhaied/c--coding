package task;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n1 = input.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int n2 = input.nextInt();

		int rslt = getTotal(n1,n2);
		
		System.out.println("Sum= "+rslt);

	}
	public static int getTotal(int a,int b) {
		int s =  a + b;
		return s;
	}

}
