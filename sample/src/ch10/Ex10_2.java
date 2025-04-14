package ch10;

import java.util.Calendar;

public class Ex10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//요일은 1부터 시작하기때문에 DAY_OF_WEEK[0]은 비워두었다
		final String [] DAY_OF_WEEK = {"","일","월","화","수","목","금","일"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month의 경우 0부터 시작하기때문에 4월인 경우, 3으로 지정해야한다.
		date1.set(2025, 2,9);
		System.out.println("date1은" + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("오늘(date2)는" +toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);
		
		// 두 날짜간의 차이를 얻으려면 , getTimeInMillis() 천분의 일초 단위로 반환해야한다.
		
		long difference =(date2.getTimeInMillis() - date1.getTimeInMillis()) /1000; //초단위 데이터
		System.out.println("그날(date1)부터 지금(date2)끼지" + difference +"초가 지나갔습니다.");
		System.out.println("일(day)로 계산하면" + difference/(24*60*60) +"일입니다");
	}

	private static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR)+"년"+ (date.get(Calendar.MONTH)+1) +"월" + date.get(Calendar.DATE)+"일" ;
	}



}
