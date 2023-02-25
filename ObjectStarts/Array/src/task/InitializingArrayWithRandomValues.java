package task;

public class InitializingArrayWithRandomValues {

	public static void main(String[] args) {
		int[][] ara = new int[3][3];
		
		for(int i = 0 ; i< ara.length;i++) {
			for(int j = 0 ;j<ara[i].length;j++) {
				ara[i][j] =((int)Math.random()*10 + 15);
				System.out.print(" "+ara[i][j]);
			}
			System.out.println();
		}
		

	}

}
