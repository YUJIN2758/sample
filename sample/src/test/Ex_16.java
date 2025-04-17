package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_16 {
	
	  // main 함수
    public static void main(String[] args) {
        Ex_16 sol = new Ex_16();

        int[] result1 = sol.solution(10);
        int[] result2 = sol.solution(5);

        // 결과 출력
        System.out.println("solution(10) → " + Arrays.toString(result1)); // [1, 3, 5, 7, 9]
        System.out.println("solution(5) → " + Arrays.toString(result2));  // [1, 3, 5]
    }
    
    // n 이하의 홀수를 배열로 반환하는 메서드
    public int[] solution(int n) {
    	
		/*
		 * 결과를 담을 리스트(oddList)를 만들어요. 제네릭을 써서 Integer 객체만 담을 수 있게 지정합니다. 
		 * 이건 나중에 배열로 바꿀거예요.
		 */
        List<Integer> oddList = new ArrayList<>();
        List<Integer> eddList = new ArrayList<Integer>();

		/* 1부터 n까지 2씩 증가시키는 반복문이에요. 즉, 홀수만 순회하게 됩니다. */
        for (int i = 1; i <= n; i += 2) {
			/* 위 반복문에서 찾은 홀수 i를 리스트에 추가합니다. */
            oddList.add(i);
        }

		/*
		 * oddList의 크기만큼의 정수 배열을 새로 만들어요. 
		 * 이 배열에 리스트 내용을 하나씩 옮길 거예요.
		 */
        int[] answer = new int[oddList.size()];
        for (int i = 0; i < oddList.size(); i++) {
            answer[i] = oddList.get(i);
			/* 리스트의 값을 하나씩 꺼내서 배열로 복사합니다. */
        }

        return answer;
    }

  
}