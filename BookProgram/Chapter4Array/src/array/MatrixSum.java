package array;
import java.util.Scanner;
public class MatrixSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter rows: ");
		int row = input.nextInt();
		System.out.print("Enter col: ");
		int col = input.nextInt();
		
		int[][] A = new int[row][col];
		
		System.out.print("Enter rows of 2nd matrix: ");
		int row1 = input.nextInt();
		System.out.print("Enter col of 2nd matrix: ");
		int col1 = input.nextInt();
		int[][] B = new int[row][col];
		
		
		for(int i = 0;i<row;i++)
		{
			for(int j=0;j<col;j++) {
				A[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0;i<row1;i++)
		{
			for(int j=0;j<col1;j++) {
				B[i][j] = input.nextInt();
			}
		}
		
		int[][] C = new int[row][col];
		
		for(int i = 0;i<row1;i++)
		{
			for(int j=0;j<col1;j++) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
