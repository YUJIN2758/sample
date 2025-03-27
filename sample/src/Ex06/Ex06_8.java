package Ex06;

//참조형 반환 타입
public class Ex06_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date3 d = new Date3();
		d.x =10;
		
		Date3 d2 = copy(d); //참조형으로 결과값을 받는다 static 메서드라서 참조변수가 없다. 또한 같은 class일때는 참보변수 없이 
	    System.out.println("d.x =" +d.x);
	    System.out.println("d2.x =" +d2.x);

	}
	
	static Date3 copy(Date3 d) {
		Date3 tmp = new Date3(); //새로운 객체 tmp를 생성한다
		
		tmp.x =d.x; //d.x의 값을 tmp.x에 복사하다
		return tmp; //복사한 객체의 주소를 반환한다 반환타입이 참조형일 경우 객체의 주소를 반환한다
	}

}

class Date3 {
	int x;
}