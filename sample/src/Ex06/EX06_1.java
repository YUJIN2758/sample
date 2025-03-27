package Ex06;

public class EX06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//참조변수 t선언및 객체 생성
		Tv t = new Tv();
		t.channel =7; //객체사용
		t.channelDown();//객체사용 메서드 사용
		
		System.out.println("현재 채널은" +t.channel +"입니다");
	}

}

class Tv {
	
	//tv속성의 멤버변수
	String color;
	boolean power;
	int channel;
	
	void power() { power =!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}