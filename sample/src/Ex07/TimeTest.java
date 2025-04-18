package Ex07;


class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		
		if(isValidHour(hour)) return;
		this.hour =hour;
	}
	
	//메개변수가 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isValidHour(int hour) {
		return hour <0 || hour>23;
	}
	
	public int getHour() { return hour;
		
	}
}
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t = new Time();
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
	}

}
