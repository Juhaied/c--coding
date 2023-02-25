
package TASK;

public class ShowCurrentTime {

	public static void main(String[] args) {
		long totalMilliSeconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliSeconds/1000;
		
		long curSeconds = totalSeconds % 60;
		
		
		
		long totalMin = totalSeconds /60;
		long curMin= totalMin % 60;
		
		
		long totalHour = totalMin / 60;
		long curHour = totalHour % 24;
		
		
		System.out.println("Current time is :"+curHour +":"+curMin +":"+curSeconds+ " G.M.T");

	}

}
