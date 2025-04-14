package Ex07;

public class Ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartTv stv = new SmartTv();
		stv.channel =10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello World");
		stv.caption =true;
		stv.displayCaption("Hello World");
	}

}


class Tv {
	boolean power; //전원상태 (on/off)
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() { --channel;}
	
}

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}