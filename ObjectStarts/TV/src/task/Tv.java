package task;

public class Tv {

	int channel = 1;
	int volumeChannel = 1;
	boolean on = false;
	
	public Tv() {
		
	}
	public void turnOn() {
		on = true ;  ///turn on tv
	}
	public void turnOff() {
		on = false;  ///tv off
	}
	public void  setChannel(int newChannel) {
		if(on && newChannel >= 1 && newChannel<=120) {
			channel = newChannel;
		}
	}
	public void setVolume(int newVolume) {
		if(on && newVolume >=1 && newVolume <= 7) {
			volumeChannel = newVolume;
		}
	}
	public void Channelup() {
		if(on && channel<120) {
			channel++;
		}
	}
	public void Channeldown() {
		if(on && channel>1) {
			channel--;
		}
	}
	public void Volumeup() {
		if(on && volumeChannel<7) {
			volumeChannel++;
		}
	}
	public void Volumedown() {
		if(on && volumeChannel>1) {
			volumeChannel--;
		}
	}
}
