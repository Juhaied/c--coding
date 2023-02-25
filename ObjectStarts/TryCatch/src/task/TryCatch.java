package task;
import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] ara = new int[3][3];
		System.out.println("Enter your input:  ");
		for(int i = 0 ;i<3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.println("ara[" + i + "][" + j + "] = ");
				ara[i][j] = input.nextInt();
			}
		}
		
		try {
		System.out.println("Input matrix");
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.print(" "+ara[i][j]);
			}
			System.out.println();
		}	
		
	}
		catch(Exception unkwonException){
			unkwonException.printStackTrace();
			
		}
		int sum = 0;
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(ara[i] == ara[j]) {
					sum = sum + ara[i][j];
				}
			}
			
		}
		System.out.println("Sum = "+sum);
		System.out.println();
		int sum2 = 0;
		
		
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.println("Enter which column u want to sum:");
				
				int col = input.nextInt();
			sum2 = sum2 + ara[i][col];
		
		}
			}
		System.out.println("coloumn sum: "+sum2);
		System.out.println("Thanks");
	}
	
	
}
