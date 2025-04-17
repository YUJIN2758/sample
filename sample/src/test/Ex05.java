package test;

import java.util.*;

/*배열 (Array):

선언: int[] arr = new int[5];
값 설정: arr[0] = 10;
값 읽기: int value = arr[0];

ArrayList:

선언: ArrayList<Integer> list = new ArrayList<>();
값 추가: list.add(10);
값 읽기: int value = list.get(0);*/

public class Ex05 {

	public static int[] solution(int[] num_list) {
		// 배열의 순서를 뒤집기 위해 ArrayList를 사용
		List<Integer> list = new ArrayList<>();

		// 배열을 ArrayList로 변환
		for (int num : num_list) {
			list.add(num);
		}

		// 뒤집기
		Collections.reverse(list);

		// ArrayList를 다시 배열로 변환
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] num_list = { 1, 2, 3, 4, 5 };
		int[] num_list2 = {10, 9, 8, 7, 6, 5};
		int[] reversedList = solution(num_list);
		int[] reversedList2 = solution2(num_list2);
		System.out.println(Arrays.toString(reversedList)); // 출력: [5, 4, 3, 2, 1]
		System.out.println(Arrays.toString(reversedList2)); //
	}

	private static int[] solution2(int[] num_list2) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		// 배열을 ArrayList로 변환
				for (int num : num_list2) {
					list1.add(num);
				}

				// 뒤집기
				Collections.reverse(list1);

				// ArrayList를 다시 배열로 변환
				int[] result = new int[list1.size()];
				for (int i = 0; i < list1.size(); i++) {
					result[i] = list1.get(i);
				}

				return result;
			}
}