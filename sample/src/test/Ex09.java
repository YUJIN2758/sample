package test;

/*
정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.*/
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num_list = {1,2,3,45,5,6,7,8,9,10,11,12,13};
		System.out.println(solution (num_list));
	}

	public static int[] solution(int[] num_list) {
	    int evenCount = 0;
	    int oddCount = 0;
	    
	    for (int num : num_list) {
	        if (num % 2 == 0) {
	            evenCount++;
	        } else {
	            oddCount++;
	        }
	    }
	    System.out.println(new int[] {evenCount, oddCount});
	    return new int[] {evenCount, oddCount};
	}
}
