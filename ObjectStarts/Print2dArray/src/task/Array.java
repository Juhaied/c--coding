package task;
import java.util.Scanner;
public class Array {
public int row,col;

public Array() {
	this.row = row;
	this.col = col;
}
public int[][] printArray() {
	Scanner input = new Scanner (System.in);
	int[][] arr = new int[row][col];
	for(int i =0;i<row;i++) {
		for(int j = 0;j<col;j++) {
			arr[i][j] = input.nextInt();
		}
		System.out.println();
	}
	
	return new int[row][col];
	
}
}