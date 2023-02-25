package task;

public class TestTv {

	public static void main(String[] args) {
	TV t1 = new TV();
t1.turnOn();
t1.setChannel(56);
t1.setVolume(4);
	System.out.println("Tv on ? "+t1.on + " Channel = "+t1.channel + " Volume = "+t1.volLevel);
System.out.println("After some change:  " );

System.out.println();
t1.channelUp();
t1.VolumeUp();
System.out.println("Channel = "+t1.channel +" volume = "+t1.volLevel);
	TV t2 = new TV();
	t2.turnOn();
	t2.setChannel(20);
	System.out.println(t2.on);
	System.out.println(t2.channel);
	t2.channelDown();
	System.out.println(t2.channel);
	}

}
