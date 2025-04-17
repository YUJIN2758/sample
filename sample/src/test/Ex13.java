package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.*/
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String my_string ="abcd12ef45";
		System.out.println(solution(my_string));
	}
	
		public static List<Integer> solution(String my_string) {
	        List<Integer> numbers = new ArrayList<>();
	        
			/*
			 * List<Integer>: 정수 (Integer) 객체들을 담을 수 있는 리스트 인터페이스 타입입니다. new ArrayList<>():
			 * ArrayList 클래스의 인스턴스를 생성합니다. List는 인터페이스이고, ArrayList는 이를 구현한 클래스입니다. <> 안을
			 * 비워둔 것은 Java 7 이상부터 가능한 다이아몬드 연산자로, 앞의 타입에서 Integer임을 추론할 수 있기 때문에 생략이 가능합니다.
			 */
	        
	        // 문자열을 하나씩 확인하면서 숫자인 경우 리스트에 추가 
	        for (char ch : my_string.toCharArray()) {
	        //	Character.isDigit(ch)로 숫자인지 판별
	            if (Character.isDigit(ch)) {
	            	//Character.getNumericValue(ch)로 char를 int로 변환
	            	numbers.add(Character.getNumericValue(ch));
	            }
	        }
	        
	        // 오름차순 정렬 Collections.sort()로 리스트를 오름차순 정렬
	        Collections.sort(numbers);
	        
	        return numbers;
		}

}
