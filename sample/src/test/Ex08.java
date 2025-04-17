package test;

/*머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와
머쓱이의 키 height가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
*/
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[]	array = {150, 160, 170, 180,190,200} ;
   int height = 165;
   System.out.println(solution (array,height)); 
  
	}

	public static int solution(int[] array, int height) {
	        int count = 0;
	        
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] > height) {
	                count++;
	            }
	        }
	        
	        return count;
	    }

}
