package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
      DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
      
      try {Date d = df.parse("2019년 11월 23일"); //문자열을 날짜로 변경함
      System.out.println(d);
      System.out.println(df.format(d));
      System.out.println(df2.format(d));//날짜를 문자열로 변경
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}

}
