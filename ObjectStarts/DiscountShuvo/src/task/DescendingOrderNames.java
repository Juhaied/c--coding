package task;
import java.util.Scanner;
public class DescendingOrderNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st name: ");
		String str1 = input.next();
		
		System.out.println("Enter 2nd name: ");
		String str2 = input.next();

		System.out.println("Enter last name: ");
		String str3 = input.next();
		
		if(str1.compareTo(str2)> 0 && str1.compareTo(str3)>0) {
			System.out.println(str1);
			if(str2.compareTo(str3)>0) {
				System.out.println(str2);
				System.out.println(str3);
			}
			else {
				System.out.println(str3);
				System.out.println(str2);
			}
		}
		else if(str2.compareTo(str1)> 0 && str2.compareTo(str3)>0) {
			System.out.println(str2);
			if(str1.compareTo(str3)>0) {
				System.out.println(str1);
				System.out.println(str3);
			}
			else {
				System.out.println(str3);
				System.out.println(str1);
			}
		}
		else {
			System.out.println(str3);
			if(str1.compareTo(str2)>0) {
				System.out.println(str1);
				System.out.println(str2);
			}
			else {
				System.out.println(str2);
				System.out.println(str1);
			}
		}
	}

}
