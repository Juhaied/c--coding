package task;
import java.util.Scanner;
public class PassingArrayToMethods {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int row = input.nextInt();
		
		System.out.println("Enter cols: ");
		int col = input.nextInt();
		
		int[][] ara = new int[row][col];
		
		printArray(ara);

	}
	public static void printArray(int[][] a) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.println("ara[" + i + "][" + j + "]=");
				a[i][j] = scan.nextInt();
			}
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				sum = sum + a[i][j];
			}
		}
		System.out.println("Sum = "+sum);
	}

}
