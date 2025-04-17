package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.*/
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n =123;
     int[] answer = solution(n);
     System.out.println(Arrays.toString(answer));
	}

	public static int[] solution(int n) {
        List<Integer> oddList = new ArrayList<>();

        for (int i = 1; i <= n; i += 2) {
            oddList.add(i);
        }

        // 리스트를 배열로 변환
        int[] answer = new int[oddList.size()];
        for (int i = 0; i < oddList.size(); i++) {
            answer[i] = oddList.get(i);
        }
        
        return answer;
    }

}
