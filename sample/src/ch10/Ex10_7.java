package ch10;

import java.text.DecimalFormat;

public class Ex10_7 {
	/*
	 * 문자열에서 숫자 parse 
	 * 숫자를 형식문자 format
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			
			System.out.println(Double.parseDouble("1234567.89")); //parseDouble, parseInt ,
			Number num =df.parse("1,234,567.89"); //문자열을 숫자로 변녕
			System.out.printf("1,234,567.89" + "->");
			
			double d = num.doubleValue(); // d.1234567.89 더블형식으로 벼경
			System.out.println(d + " ->");
			System.out.println(df2.format(num)); //지수형식의 문자로 변경
					
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
