package task;
import java.util.Scanner;
public class FindingTheLargestElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i,j = 0;
		int[][] a = new int[3][3];
		double max = a[0][0];
		for(i = 0;i<3;i++) {
			for(j = 0;j<3;j++) {
				System.out.println("a[" + i + "][" + j + "]=");
				a[i][j] = scan.nextInt();
			}
		}
		for(i = 0;i<3;i++) {
			for(j = 0;j<3;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		for(i = 0;i<3;i++) {
			for(j = 0;j<3;j++) {
				if(a[i][j]>max) {
					max = a[i][j];
				}
			}
			
		}
		System.out.println("max = "+max);
	}

}
