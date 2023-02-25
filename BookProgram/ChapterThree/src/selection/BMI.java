package selection;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your weight in kg: ");
    double weight = input.nextDouble();
    
    System.out.print("Enter your height in meters: ");
    double height = input.nextDouble();
    
    double BMI = weight/height* height;
    
    System.out.print("BMi = "+BMI);
	}

}
