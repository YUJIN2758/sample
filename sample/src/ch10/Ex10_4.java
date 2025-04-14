package ch10;

import java.util.Calendar;

public class Ex10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar date = Calendar.getInstance();
		date.set(2019,7,31);
		
		System.out.println(toString(date));
		System.out.println("=1일 후+");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("=6달전+");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		//add() 와 달리 roll()은 다른 필드의 영향을 주지 않는다.
		System.out.println("=31일후(roll)+");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		

	}

	private static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR) +"년" + (date.get(Calendar.MONTH)+1) +"월" +date.get(Calendar.DATE) +"일";
	}

}
