package Ex07;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPoint3D p = new MyPoint3D();
		
	p.x=3;
	p.y=5;
	p.z=7;
	
	System.out.println(p.getLocation());

	}

}

class MyPoint3 {
	int x;
	int y;
	String getLocation() {
		return "x:" +x+",'y:"+y;
	}
}


class MyPoint3D extends MyPoint3 {
	int z;
	
	//메서드 상속받은 조상의 메서드를 자신에 맞게 변경하는 것

	//조상의 getLocation()을 오버라이딩ㅇ
	String getLocation() {
		return "x:" +x+",'y:"+y +"z:"+z;
	}
	
}