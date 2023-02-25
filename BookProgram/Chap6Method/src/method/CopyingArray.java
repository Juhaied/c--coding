package method;

public class CopyingArray {

	public static void main(String[] args) {
		int[] ara = {1,3,5,7};
		
		int[] copyAra = new int[ara.length];

		for(int i = 0;i<ara.length;i++) {
			copyAra[i] = ara[i];
			System.out.print(copyAra[i]);
		}
		
		
	}

}
