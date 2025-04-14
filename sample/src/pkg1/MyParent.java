package pkg1;


public class MyParent {// default라서 같은 패키지 안에서만 사용이 가능함
	

	private int prv; //같은 클래스
	int dft; //같은 패키지
	protected int prt; //같은 패키지 + 다른 패지지 자손
	public int pub; 
	
	public void  printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyParent p = new MyParent();
		//System.out.println(p.prv);// 접근제어 private 이라 다른 클래스에서는 접근이 되지 않음
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}

