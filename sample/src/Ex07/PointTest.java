package Ex07;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point3D p3 = new  Point3D(1,2,3);
	}

}
//모든 생성자는 반드시 다른 생성자를 호출해야한다
//기본 생성자는 필수
//컴파일러가 super() 생성자를 넣는다
//조상의 생성자는 조상생성자로 초기화

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x =x;
		this.y=y;
	}
	
	String getLocattion() {
		return "x :"+ x+", y :" +y;
	}
}

class Point3D extends Point {// Point 조상클래스 상속
	
	int z;
	Point3D(int x, int y, int z) {
		super(x, y); // 조상의 생성자 point(int x,int y)를 호출
		this.z =z;
		// TODO Auto-generated constructor stub
	}

	String getLocattion() { // 조상 클래스 오버라이딩
		return "x :"+ x+", y :" +y+", z :" +z;
	}
	
	
}