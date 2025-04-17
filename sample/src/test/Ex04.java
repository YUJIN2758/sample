package test;

import java.util.Arrays;
public class Ex04 {


	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
	        int num1 = 2;
	        int num2 = 5;

	        System.out.println(Arrays.toString(solution(numbers, num1, num2))); // 출력: [3, 4, 5]
	    }

	    public static int[] solution(int[] numbers, int num1, int num2) {
	        // num1번 인덱스부터 num2번 인덱스까지 자른 부분 배열을 반환
	        return Arrays.copyOfRange(numbers, num1, num2 + 1);
	    }
	}

