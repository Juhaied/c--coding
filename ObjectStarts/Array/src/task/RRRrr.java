package task;

public class RRRrr {

	public static void main(String[] args) {
		int[] ara = new int[5];
		
		for(int i = 1;i<5;i++) {
			ara[i] = i + ara[i-1];
			System.out.println(ara[i]);
		}
		ara[0] = ara[1] + ara[4];
		System.out.println(ara[0]);

	}

}
