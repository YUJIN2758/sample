package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ex11_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		
		HashMap map = new HashMap();
		
		for(int i=0; i< data.length; i++) {
			if(map.containsKey(data[i])) {// key를 포함하고 있냐
				int value =(int)map.get(data[i]);
				map.put(data[i], value+1);
			}else {
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry entry =(Entry)it.next();	
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() +" :" + printBar('#', value) + "" + value);}

	}

	private static Object printBar(char c, int value) {
		// TODO Auto-generated method stub
		return null;
	}

}
