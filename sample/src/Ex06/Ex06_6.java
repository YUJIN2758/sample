package Ex06;

public class Ex06_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();// 객체생성
		d.x =10;
		System.out.println("main(): x =" + d.x);
		
		change(d.x);
		System.out.println("After chang(d.x)");
		System.out.println("main() : x= " + d.x);
	}

	static void change(int x) { //change 메소드 x는 지역변수로 해당 메소드 종료 후 소멸됨
		x=1000;
		System.out.println("change(): x = " +x);
	}
}

class Date{
	int x;
}