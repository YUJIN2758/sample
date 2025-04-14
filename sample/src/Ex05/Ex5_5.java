package Ex05;

import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ball = new int[45]; //45개의 정수값을 저장하는 배열 객체 생성
		
		//배열의 각 요소에 1~45의 값을 저장한다
		
		System.out.println(ball.length);
		
		for(int i=0; i< ball.length; i++) 
			ball[i] =i+1;
			
       System.out.println(Arrays.toString(ball));
		int tmp=0;
		int j =0;
		
		for (int i=0; i<6; i++) {
			j =(int)(Math.random()*45);//0~44
			tmp = ball[i];
			ball[i] =ball[j];
			ball[j] =tmp;
			System.out.print(Arrays.toString(ball) );	
			}
				
		
		}
		
	}


