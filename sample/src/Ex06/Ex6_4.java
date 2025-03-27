package Ex06;

public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L); // 결과를 담을 값도 형이 일치해야한다
		
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double reuslt4 = mm.divide(5L, 3L);
		long result5 = mm.max(5L, 3L); //둘중에 큰것
		long result6 = mm.min(5L, 3L); 
		mm.printGugudan(12);
		
		System.out.println("add(5L, 3L)"+result1);
		System.out.println("substract(5L, 3L)"+result2);
		System.out.println("multiply(5L, 3L)"+result3);
		System.out.println("divide(5L, 3L)"+reuslt4);
		System.out.println("max(5L, 3L)"+result5);
		System.out.println("min(5L, 3L)"+result6);
	}

	/*
	 * private static void printGugudan(int i) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}

class MyMath{ // 작업을 끝내면 호출한 곳으로 돌아옴
	long add(long a, long b) { //메서드는 클래스 영역에만 정의가능
	//	long result = a+b;
		return a+b;
	//	return a> b? a: b;
	}
	
	long max (long a, long b) {
		return a> b? a: b;
	}
	long min (long a, long b) {
		return a<b? a : b; //타입이 일치하거나 자동형변환이 가능한 상태여야 한다 char/byte,short는 자동형변환됨
	}
	long substract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {return a/b;}
	
	void printGugudan(int dan) {
		
		if(!(2<=dan && dan<=9)) {
			return;
		}
		for(int i=1;i<=9; i++) {
			System.out.printf("%d * %d =%d%n", dan, i, dan*i);
		}
		
		
	}
}