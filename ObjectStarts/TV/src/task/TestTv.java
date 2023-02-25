package task;

public class TestTv {

	public static void main(String[] args) {
		Tv one = new Tv();
		
		one.turnOn();
		one.setChannel(30);
		one.setVolume(4);
		
		System.out.println("watching channel "+one.channel);
System.out.println("Volume of channel "+one.volumeChannel);
one.Channeldown();
System.out.println("After channel down = "+one.channel);
one.Volumeup();
System.out.println("after up volume = "+one.volumeChannel);
	}

}
