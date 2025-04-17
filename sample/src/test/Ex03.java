package test;

public class Ex03 {

 //	문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

	/*
	 * // 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요. int solution(const
	 * char* str1, const char* str2) { int answer = 0; return answer; }
	 */
	static int	answer =0;
	public static void main(String[] args) {
		
		solution('a','b');
		System.out.println(" answer의값 : " + answer);
		
		

	}

	private static int solution(char str1, char str2) {
	 
		if(String.valueOf(str1).contains(String.valueOf(str2))) {
			answer = 1;
		} else {
			 answer = 2;	
		}
		return answer;
		
	}
}
