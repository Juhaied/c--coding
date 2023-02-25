package selection;
import java.util.Scanner;
public class Prob333 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		double x = input.nextDouble();
		double y= input.nextDouble();
		double z=input.nextDouble();
		
		System.out.println((x<y && y<z)?" sorted ":" not sorted" );
		
		
		//another prob not related to this
		
System.out.println(2 * 3 - 3 > 2 && 10-2 > 5 );

//another problem
int a = 6,b=-2;
System.out.println(a > 0 || a < 10 && b < 0) ;

System.out.print(x > 0 || (x < 10 && y < 0));

	}

}
