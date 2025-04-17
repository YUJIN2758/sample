package test;

/*정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.*/
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,3,5,3,4,7,3,9,10,11};
		int n = 3;
		System.out.println(solution (array, n));
	}

	public static int solution(int[] array, int n) {
        int count = 0;
        
        // 배열을 순회하면서 n이 등장할 때마다 count 증가
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }
        
        return count;
    }
}
