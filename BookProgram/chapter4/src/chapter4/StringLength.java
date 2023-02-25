package chapter4;
import java.util.Scanner;
public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = input.nextLine();
		
		System.out.print("The length of string is "+str.length());

	}

}
