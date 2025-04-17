package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {

	@SuppressWarnings("unchecked") //미확인 오퍼레이션과 관련한 경고를 억제한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArr = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strArr); //대문자 먼저 앞에 나옴
		System.out.println("strArr =" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);// 클래스이름. 대소문자 구분안함
		
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr=" +  Arrays.toString(strArr));

	}

}


@SuppressWarnings("rawtypes")
class Descending  implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			@SuppressWarnings("rawtypes") //지네릭을 사용하는 클래스 매개 변수가 특정되지 않을때 경고 억제
			Comparable c1 =(Comparable)o1;
			Comparable c2 =(Comparable)o2;
			return c1.compareTo(c2)* -1;
		}
		return -1;
	}
	
}