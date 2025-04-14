package ch10;

import java.util.Calendar;
import java.util.Date;

public class Ex10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int[] TIME_UNIT = {3600,60,1}; //큰 단위를 앞에 놓는다
		final String[] TIME_UNIT_NAME = {"시","분","초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		System.out.println(new Date (time1.getTimeInMillis()));
		time1.clear(); //1970년 1월 1일 00:00:00
		System.out.println(new Date (time1.getTimeInMillis()));
		
		//time1에 10시 20분 30초 세팅한다
		time1.set(Calendar.HOUR_OF_DAY, 10);  //시간
		time1.set(Calendar.MINUTE, 20); //분
		time1.set(Calendar.SECOND, 30); //초
		
		//time2 20시 30분 10초
		
		time2.set(Calendar.HOUR_OF_DAY, 20);  //시간
		time2.set(Calendar.MINUTE, 30); //분
		time2.set(Calendar.SECOND, 10); //초
		
		System.out.println(time1.get(Calendar.HOUR_OF_DAY)+TIME_UNIT_NAME[0] + time1.get(Calendar.MINUTE) +TIME_UNIT_NAME[1] + 
				time1.get(Calendar.SECOND)+ TIME_UNIT_NAME[2] +" 입니다");
		System.out.println(time2.get(Calendar.HOUR_OF_DAY)+"시" + time2.get(Calendar.MINUTE) +"분" + time2.get(Calendar.SECOND)+ "초입니다");
		
		long difference= Math.abs(time2.getTimeInMillis() -time1.getTimeInMillis())/1000;
		System.out.println("time1과 time2의 차이는 " + difference +" 초 입니다.");
		
		//시분초로 변환하면 10시간 9분 40초입니다.
		
		String tmp ="";
		for(int i=0; i<TIME_UNIT.length; i++) {
			tmp+= difference/TIME_UNIT[i] +TIME_UNIT_NAME[i];
			difference %=TIME_UNIT[i];
		}
		
		System.out.println("시분초로 변경하면" + tmp +"입니다"); 
		
		

	}

}
