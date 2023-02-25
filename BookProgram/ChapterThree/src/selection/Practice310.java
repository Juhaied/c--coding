package selection;
import java.util.Scanner;
public class Practice310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Score:  ");
		int score = input.nextInt();
		//it will alwyz print d if we give a value above 60 or 60 cz in if else if one statement is true it prints
		//that
		if (score >= 60.0)  
			System.out.println("D");
		else if (score >= 70.0) 
			System.out.println("C");
		else if (score >= 80.0) 
			System.out.println("B");
		else if (score >= 90.0) 
			System.out.println("A");
		else  System.out.println("F");
		
		int num = 9;
		boolean even = num % 2 == 0;
		System.out.print(even);


	}

}
