package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
	
	//컬렉션 : 여러 객체(데이터)를 모아 놓은것을 의미
	//프레임웍 : 표준화 정형화된 체계적인 프로그래밍 방식
	//컬랙션 프레임웍 : 컬렉션(다수의 객체)를 다루기 위한 표준화된 프로그램방식
	//컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스를 제공 / 저장 삭제 검색 정렬
	
	/*
	 * List : 순서가 있는 데이터의 집합. 데이터의 중복을 허용한다 예) 대기자 명단 ArrayList LinkedList Stack, Vector 저장순서/ 중복
	 * Set : 순서를 유지하지 않는 데이터의 집합 데이터의 중복을 허용하지 않는다 예) 양의 정수집합, 소수의 집합  HashSet TreeSET
	 * Map : 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합 순서는 유지되지 않으며 키는 중복을 허용하지 않고 값은 중복을 허용한다. 예)우편번호, 지역번호
	 * HashMap, TreeMap
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ArrayList 데이터의 저장 공간으로 배열을 사용한다 
		 * List 인터페이스를 구현하므로 저장순서가 유지되고 중복을 허용한다.
		 */
		// 기본 길이(용량, capacity) 가 10인 ArrayList 생성
		@SuppressWarnings("rawtypes")
		ArrayList list1 = new ArrayList(10);
		//ArrayList 에 객체만 저장가능
		//autoboxing에 기본형이 참조형으로 자동 변환
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		//Collections 유틸클래스 
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2)" +list1.containsAll(list2));
	}

	private static void print(ArrayList list1, ArrayList list2) {
		// TODO Auto-generated method stub
		
	}

}
