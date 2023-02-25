package selection;
import java.util.Scanner; 
public class Prob332 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 6: ");
		int day = input.nextInt();
		
		switch(day)
		{
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		}
int num = 6;

System.out.print((num % 2 == 0)?+num+"is even":"num is odd");
	}

}
