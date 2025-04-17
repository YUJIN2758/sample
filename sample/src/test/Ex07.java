package test;


/*자바 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.*/
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(add("abc",3));
	}

	private static String add(String my_string, int  n) {
		// TODO Auto-generated method stub
		//StringBuilder를 사용하여 문자열을 효율적으로 연결합니다.
		StringBuilder result = new StringBuilder();
		
		//my_string의 각 문자를 하나씩 가져와서 해당 문자를 n번 반복하여 result에 추가합니다.
		for(int i=0; i<my_string.length(); i++) {
		//	my_string의 각 문자를 하나씩 가져와서 해당 문자를 n번 반복하여 result에 추가합니다.
			char c = my_string.charAt(i);
			for(int j =0; j<n; j++) {
				result.append(c);
			}
		}
		//마지막에 StringBuilder를 String으로 변환하여 반환합니다.
		return result.toString();
	}
	
	

}
