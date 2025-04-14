package ch10;

import java.util.Calendar;

public class Ex10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if(args.length !=2) { System.out.println("Usage : java Ex10_5 2019 9");
		 * return; }
		 */
		int year = 2025; //Integer.parseInt(args[0]);
		int month = 4; //Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0 ; //1일이 무슨 요일인지
		int END_DAY = 0 ; //마지막 날짜
		
		Calendar sDay = Calendar.getInstance(); //시작일
		Calendar eDay = Calendar.getInstance(); //종료일
		
		//월의 경우 0부터 11까지의 값을 가지므로 1을 빼줘야한다.
		//예를 들어 2019년 11월 1일 sDay.set(2019,10,1)과 같이 해줘야 한다.
		sDay.set(year, month-1,1); // month 0부터 시작 2019.9.1
		eDay.set(year, month,1); //2019.10.1
		
		//다음달의 첫날(12월 1일)에서 하루를 빼면 현재달의 마지막 날인 (11월 30일)
		eDay.add(Calendar.DATE,-1); //2019.9.31
		
		//첫번째 요일이 무슨 요일인지 알아낸다 1일이 무슨 요일인지 알아낸다
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("     " + year +"년" + month + "월");
		System.out.println(" SU MO TH WE TH FR SA");
		
		for (int i=1; i< START_DAY_OF_WEEK; i++) {
			System.out.print("  ");
		}
		
		for (int i =1, n=START_DAY_OF_WEEK; i<=END_DAY; i++,n++) {
			System.out.print((i<10)?  "   " + i : " " +i);
			if(n%7 ==0) System.out.println();
		}
	}

}
