package Ex07;

public class Ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		Car car2 =(Car)fe;
		car2.drive();
		
		fe.water(); //본인꺼 사용
		car = (Car)fe; //FireEngine 객체를 car에 넣음  객체수를 4개로 줄임 //형변환 생략 자식을 조상으로 
	//	car.water(); //객체수가 4개가 되었기때문에 FireEngine 객체는 사용못함
		fe2 = (FireEngine)car; //car객채를 FireEngine 객체로 형변환 다시 5개 조상을 자식으로 형변환 증가하는 쪽은 꼭 형변환을 적어줘야함
		fe2.water(); //형변환으로 다시 사용 가능함

	}

}

class FireEngine extends Car {
	void water() {
	System.out.println("water");}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive Brrrr");
	}
	void Stop() {
		System.out.println("Stop!!");
	}
}