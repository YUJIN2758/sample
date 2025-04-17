package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer>  map = new HashMap<String, Integer>();
	
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		
		Set set = map.entrySet(); 
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Entry e = (Entry)it.next(); //Map의 내부인터페이스
			System.out.println("이름 :" + e.getKey() + ", 점수:" + e.getValue());
		}
		
		set =map.keySet();  // key값만 가져온다
		System.out.println("참가자명단 :" + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total =0;
		
		while (it.hasNext()) {
			int i =(int)it.next();
			total += i;
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균:" + (float)total/set.size());
		System.out.println("최고점수:" + Collections.max(values));
		System.out.println("최저점수:" + Collections.min(values));
		
	}

}
