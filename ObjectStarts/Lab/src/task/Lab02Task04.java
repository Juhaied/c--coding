package task;
import java.util.Scanner;
public class Lab02Task04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a : ");
		int a = input.nextInt();

		System.out.println("Enter b : ");
		int b = input.nextInt();
		
		System.out.println("Enter c : ");
		int c = input.nextInt();
		
		double determinant =(( b * b) - (4 *a * c));
		
		if(determinant >0) {
			double root1 = (- b + Math.sqrt(determinant))/(2 *a);
			System.out.println("Root1 = "+((int)(root1 * 100))/100);
			double root2 = (- b - Math.sqrt(determinant))/(2 *a);
			System.out.printf("root2 = %.2f",root2);
		}
	}

}
