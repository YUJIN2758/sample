package Ex05;

public class Ex05_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = { 79,88,91,33,100,55,95};
		int max = score[0]; //배열의 첫 번째 값으로 최대값을 초기화한다
		int min = score[0]; //배열의 첫 번째 값으로 최소값을 초기화한다
		
		for(int i=1; i<score.length; i++) {
			
			if(score[i]>max){
				max =	score[i];
			}else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("max값:" + max);
		System.out.println("min값:" + min);
	}

}
