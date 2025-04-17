package test;

import java.util.Arrays;

/*문자열 before와 after가 매개변수로 주어질 때, 
before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.ㅁㅁㅁㅁㅁㅁ*/
public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String before = "abcd";
		String after ="dcab";
		
		System.out.println(solution (before,after));
	}

	public static int solution(String before, String after) {
        // 문자열을 문자 배열로 변환하고 정렬
		//toCharArray()는 자바에서 문자열(String)을 문자 배열(char[])로 변환할 때 사용하는 메서드입니다.
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        // 정렬된 배열이 같으면 1, 아니면 0 반환
        return Arrays.equals(beforeArr, afterArr) ? 1 : 0;
    }

}
