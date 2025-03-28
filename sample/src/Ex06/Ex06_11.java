package Ex06;

/* 인스턴스가 생성될때 마다 호출되는 인스턴스 초기화 메서드
객체를 초기화 해 주는 메서드
생성자 호출 (인스턴스 초기화 인스턴스 변수 초기화)

1. 생성자 이름은 클래스 이름과 같아야한다.
2. 리턴값이 없다 (void 안붙음) 대입문이기때문에 return값이 없다. 항상 반환값이 없다
3. 모든 클래스는 반드시 생성자를 가저야 한다.
  (생성자가 하나도 없을 경우 컴파일러가 기본 생성자를 자동으로 생성함)

기본생성자- 매개변수가 없는 생성자
Point(){} -> 기본 생성자

 */

public class Ex06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data_1 d1 = new Data_1(); //기본 생ㅇ성자 호출
		Data_2 d2 = new Data_2(); //생성자호출
		
		
		
	}

}

class Data_1 {
	int value; //생성자가 없어 기본 생성자로 처리
	
	//Data_1(){};// 생성자 생략 가능
}

class Data_2 {
	int value;
	
	Data_2(){
		
	} //기본 생성자 추가
	
	Data_2(int x){
		value =x; //매개변수가 있는 생성자
	}
}