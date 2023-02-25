package selection;
import java.util.Scanner;
public class TsetBooleanOperators {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		int x=2,y=3,z=6;
		
		if(num% 2== 0 && num % 3==0) {
			System.out.println(+num +" is divisible by both 2 and 3");
			
		}
		if(num % 2 == 0 || num % 3 == 0) {
			System.out.println(+num +" is divisible by 2 or 3");
		}
		if(num % 2 == 0 ^ num % 3 == 0)
		{
			System.out.println(+num +" is divisible by 2 or 3 but not both");
		}
		
		 System.out.println("(x < y && y < z) is " + (x < y && y < z)); 
		
	}

}
