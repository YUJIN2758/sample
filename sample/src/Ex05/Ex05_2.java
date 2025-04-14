package Ex05;

import java.util.Arrays;

public class Ex05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] iarr = {100,95,80,70,60};
				for (int i=0; i<iarr.length; i++) {
			System.out.println("arr ["+i+ "]="+iarr[i]);
			System.out.println(Arrays.toString(iarr));
		}
				
	   char[] chArr = {'a','b','c','d'};
	   for (int i=0; i<chArr.length; i++) {
			System.out.println("chArr ["+i+ "]="+chArr[i]);
			System.out.println(Arrays.toString(chArr));
		}
	}

}
