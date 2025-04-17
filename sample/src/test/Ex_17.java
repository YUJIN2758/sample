package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*정수 n이 매개변수로 주어질 때, n 이하의 짝수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.*/

public class Ex_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_17 d = new Ex_17();
		int n = 8;
		int[] result =Ex_17.solution(n);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(int n) {
		// TODO Auto-generated method stub
		// integer 객체를 담을 수 있는 list를 만든다.
		List<Integer> list = new ArrayList<Integer>();
		//8이하인 숫자에 짝수값을 넣는다
		for (int i=0; i<=n; i+=2) {
			list.add(i);
		}
		//배열을 만든다
		int [] answer = new int[list.size()];
		
		for (int i=0; i<list.size(); i++ ) {
			answer[i] = list.get(i);
			//배열값을 담는다
			
			
		}
		return answer;
	}

}
