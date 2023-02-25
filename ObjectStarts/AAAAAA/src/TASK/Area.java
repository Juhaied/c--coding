package TASK;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius : ");
		double r = input.nextDouble();
		
		printArea(r);

	}
	public static void printArea(double p) {
		System.out.println("Area = "+(p * p *Math.PI));
	}

}
