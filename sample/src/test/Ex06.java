package test;

public class Ex06 {


	
	public static void main(String[] args) {
		System.out.println(solution("hi",5));
	}

	private static String solution(String my_string, int n) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		//StringBuilder를 사용하여 문자열을 효율적으로 연결합니다.
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                result.append(c);
            }
        }
     //   마지막에 StringBuilder를 String으로 변환하여 반환합니다.   
        return result.toString();
    }


}

	
