package Ex05;

public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = { 100, 95, 80, 70, 60 };
		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {

			iArr1[i] = i + 1;
			System.out.print(iArr1[i]);
		}
		System.out.println();
       //Math.random 0.0 ~1.0까지
		for(int i=0;  i<iArr2.length;i++) {
			iArr2[i]=(int)(Math.random()*10)+1;//1~10난수로 배열을 채움
			System.out.print(iArr2[i]);
		}
		System.out.println();
		System.out.println("이값은" +Math.random());
	

		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		System.out.println(iArr3);
		System.out.println(chArr);


	}
}
