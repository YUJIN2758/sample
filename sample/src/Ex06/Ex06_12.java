package Ex06;

public class Ex06_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car ("white", "auto",4); //객체 초기화
		System.out.println("색상은: "+ c.color + "기어종류: " + c.gearType +"문 " +c.door);
	}

}

class Car {
	String color;
	String gearType;
	int door;
	
	Car(){} //기본 생성자
	Car(String c, String g, int d){// 매개변수가 있는 생성자
		color =c;
		gearType =g;
		door =d;
	}
	
	
	
}