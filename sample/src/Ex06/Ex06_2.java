package Ex06;

public class Ex06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 채털값은 " + t1.channel +" 입니다");
		System.out.println("t2의 채털값은 " + t2.channel +" 입니다");
		
		t1.channel =7;
		System.out.println("t1의 채털값은 " + t1.channel +" 입니다");
		
		t2 =t1; //참조변수 t1의 값을 t2에 저장한다
		System.out.println("t1의 채털값은 " + t1.channel +" 입니다");
		System.out.println("t2의 채털값은 " + t2.channel +" 입니다");

	}

}

