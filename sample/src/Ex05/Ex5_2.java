package Ex05;

public class Ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		float averge =0f;
		int[] score = {100,88,100,100,90};
		
		for (int i=0; i< score.length; i++) {
			sum =score[i]+sum;
			
		}
        System.out.println("합계:" +sum);
        averge =(float)sum/score.length;
        System.out.println("평균 :" + averge);
	}

}
