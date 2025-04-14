package ch10;

public class Ex10_3_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coinUnit = {500,100,50,10};
		
		int money =2680;
		System.out.println("money= " + money);
		int total =0;
		
		for(int i=0; i<coinUnit.length; i++) {
		//	money += coinUnit[i];
		/*
		 * total = money/coinUnit[i]; money=money%coinUnit[i];
		 */
			System.out.println(coinUnit[i] +"원" + money/coinUnit[i]);
			money=money%coinUnit[i];
		}
		
		// 500원 5 100원 1개 50원 1개 10원 3개
		
		
	}
	

}
