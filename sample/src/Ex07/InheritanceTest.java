package Ex07;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle();
		c.c.x =1;
		c.c.y =2;
		c.r =3;
		
		System.out.println("c.x="+c.c.x);
		System.out.println("c.y="+c.c.y );
		System.out.println("c.r="+c.r);
	}

}

class MyPoint {
	int x;
	int y;
}

/* 이건 상속
 * class Circle extends MyPoint { int r; }
 */

/* 이건 포함 */
class Circle {
	int r;
	MyPoint c  = new MyPoint();
}