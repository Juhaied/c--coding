package problem;
import java.util.Scanner;
public class CelciusToFahreinheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter degree in celcius:  ");
    double celcius = input.nextDouble();
    
    double fahreinheit = (9/5.0) * celcius + 32;
    
    System.out.print(celcius + "is" +fahreinheit +"Fahreinheit");
	}

}
