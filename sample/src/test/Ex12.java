package test;

import java.util.Arrays;

/*정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
 return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* answer = (int*)malloc(1);*/
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {4,5,6,7,8,9};
		int num1 =3;
		int num2 =5;
		int[] result =solution(numbers,num1,num2);
		
		System.out.println(Arrays.toString(result));
		
		
	}

	private static int[] solution(int[] numbers, int num1, int num2) {
		// TODO Auto-generated method stub
		
		
		return Arrays.copyOfRange(numbers, num1, num2+1);
		
	}

}
