package Ex06;

public class Ex06_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date2 d = new Date2();// 객체생성
		d.x =10;
		System.out.println("main(): x =" + d.x);
		
		change(d);
		System.out.println("After chang(d.x)");
		System.out.println("main() : x= " + d.x);
	}

	static void change(Date2 d) { //참조형 매개변수 객체 주소를 전달해줌
		d.x=1000;
		System.out.println("change(): x = " +d.x);
	}
}

class Date2{
	int x;
}