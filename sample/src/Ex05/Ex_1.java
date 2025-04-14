package Ex05;

public class Ex_1 {

	public static void main (String[] args) {
		
	//	int[] score; //1. 배열에 참조변수 선언
	//	score =new int[5]; //2. 배열 생성( int 저장공간 *5)
		/*위내용을 한번에 사용하기 */
		
		int[] score = new int[5];
		
		score[3] =100;
		
	   System.out.println(score.length);
	   System.out.println(score[0]);
	   System.out.println(score[1]);
	   System.out.println(score[2]);
	   System.out.println(score[3]);
	   System.out.println(score[4]);
	  
	   
		
		
		  for (int i=0; i< score.length; i++) { System.out.println(score[i]); }
		 
	}
}
