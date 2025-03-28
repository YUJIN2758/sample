package Ex06;

//iv 사용여부

public class Ex06_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(MyMath2.add(200L, 100L)); //객체생성없이 호출이 가능
		MyMath2 math = new MyMath2(); //객체생성
		math.a =200L;
		math.b =100L; //iv값 세팅
		//math.add();
		System.out.println(math.add()); //인스턴스메서드 호출
		
	}

}

class MyMath2{
	
	long a,b; //iv 인스턴스 변수 클래스 전체에서 사용
	
	long add() {//인스턴스 메서드 iv사용
		return a+b; 
	}
	
	static long add (long a, long b) {//클래스 메서드(static 메서드) a,b는 지역변수(lv) 유효범위가 클래스 종료까지  iv사용 안함
		return a+b;//lv 가까운 쪽
	}
}