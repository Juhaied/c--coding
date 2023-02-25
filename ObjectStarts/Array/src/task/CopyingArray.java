package task;

public class CopyingArray {

	public static void main(String[] args) {
		int[] ara = {1,3,4,5,6,9};
		int[] copyara = new int[ara.length];

		for(int i = 0 ;i<ara.length ;i++) {
			copyara[i] = ara[i];
			System.out.print(copyara[i]);
		}
	}

}
