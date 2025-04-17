package test;

import java.util.ArrayList;
import java.util.Arrays;

/*정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.*/

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = 5; // 예시로 사용할 배열의 길이

		ArrayList<Integer> dynamicArray = new ArrayList<Integer>(length);
		for (int i = 0; i < length; i++) {
		//    dynamicArray.add(value);
		}

/*	int [] numbers	 = {1,2,3,4,5};
	int [] number1 = Arrays.copyOfRange(numbers, 1, 4);
	
	System.out.println(Arrays.toString(number1));*/
	}

	
}


/*
 * int* solution(int numbers[], size_t numbers_len, int num1, int num2) { //
 * return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요. int* answer =
 * (int*)malloc(1); return answer; }
 */