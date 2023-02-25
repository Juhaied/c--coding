import java.util.Scanner;
public class TestHours {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter seconds : ");
		int sec = input.nextInt();
		
		int min = sec / 60;
		int hour = min /60;
		sec = sec % 60;
		min = min % 60;
		System.out.println("hour  = "+hour);
		System.out.println("min = "+min);
		
		System.out.println("sec = "+sec);

	}

}
