package task;

public class TV {

	public int channel = 1;
	public int volLevel=1;
	public boolean on=false;
	
	public TV() {
		
	}
	public void turnOn() {
		on = true;
	}
	public void turnOf() {
		on = false;
	}
	public void setChannel(int newChannel) {
		if( on && channel>=1 && channel<120) {
			channel = newChannel;
		}
	}
	public void setVolume(int newVolume) {
		if(on && volLevel>=1 && volLevel<7)
			volLevel = newVolume;
	}
	public void channelUp() {
		if(on && channel<120) {
			channel++;
		}
	}
	public void channelDown() {
		if(on && channel>1) {
			channel--;
		}
	}
	public void VolumeUp( ) {
		if(on && volLevel<7) {
			volLevel++;
		}
	}
	public void VolumeDown( ) {
		if(on && volLevel>1) {
			volLevel--;
		}
	}
}
