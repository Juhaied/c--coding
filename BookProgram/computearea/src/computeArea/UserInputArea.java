package computeArea;
import java.util.Scanner;

public class UserInputArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double radius;
		System.out.print("Enter radius :  ");
		radius = input.nextDouble();
		double area = radius * radius * 3.1416;
		
		System.out.print(" the area of the radius "  + radius +  "is"  +area);

	}

}
