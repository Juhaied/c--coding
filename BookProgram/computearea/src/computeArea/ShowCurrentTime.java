package computeArea;

public class ShowCurrentTime {

	public static void main(String[] args) {
		//obtaining the total milliseconds
		
		long totalMilliSeconds = System.currentTimeMillis();
		
		//obtain total seconds
		
		long totalSeconds = totalMilliSeconds / 1000;
		
		//obtain current seconds
		
		long currentSeconds = totalSeconds % 60;
		
		// obtain total minitues
		
		long totalMinitues = totalSeconds/60;
		
		//obtain current minitues
		
		long currentMinitues = totalMinitues % 60;
		
		// obtain total hours
		
		long totalHours = totalMinitues / 60;
		
		//obtain current hours 
		
		long currentHours = totalHours % 24;
		
		System.out.print("Current time is "+currentHours + ":" +currentMinitues + ":" +currentSeconds +"G.M.T");
		 
	}

}
