package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
*/
public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n = 15;
   int k = 5;
   Ex_18 c = new Ex_18();
   int[] result = Ex_18.solution(n,k);
   
   System.out.println(Arrays.toString(result));
	}

	private static int[] solution(int n, int k) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=n; i++) {
			if(i%k ==0) {
				list.add(i);
			}
		}
		int[] answer = new int [list.size()];
		
		for (int j=0; j<list.size(); j++) {
			answer[j] =list.get(j);
		}

		return answer;
		
	}

}
