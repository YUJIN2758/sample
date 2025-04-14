package ch11;

import java.util.Arrays;

public class Ex11_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr =" + Arrays.toString(arr));
		System.out.println("arr2D = "+ Arrays.deepToString(arr2D));//이차원배열 deepToString
		
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		int [] arr3 = Arrays.copyOf(arr, 3);
		int [] arr4 = Arrays.copyOf(arr, 7);
		int [] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int [] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		
		System.out.println("arr2=" + Arrays.toString(arr2));
		System.out.println("arr3=" + Arrays.toString(arr3));
		System.out.println("arr4=" + Arrays.toString(arr4));
		System.out.println("arr5=" + Arrays.toString(arr5));
		System.out.println("arr6=" + Arrays.toString(arr6));
		
		int [] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("arr7=" + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); //람다식 1~6
		System.out.println("arr7=" + Arrays.toString(arr7));
		
		for (int i : arr7) {  //향상된 포문  배열의 요소를 순서대로 하나하나 꺼내서 i에 넣음
	/*		for(int x=0; x<arr7.length; x++) {
				int i = arr7[x];*/
			char[] graph = new char[i]; //배열을
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);  // string => char로 toCharArray 배열을 String으로 바꾸는거 생성자를 통해서
		}
		
		String ccc = "abcdef";
		
		char[] bbb = ccc.toCharArray();
		
		System.out.println("char[] bbb의 값="+bbb);
		
		for(int z : bbb) {
			System.out.println("for문돌린 값 z=" + z);
		}
		
	    	String s = "AaBbCcDd";
	      char[] chars = s.toCharArray();
	      System.out.printf("Original string: {0}", s);
	      System.out.print("Character array:");
	      for (int ctr = 0; ctr < chars.length; ctr++)
	      {
	    	  System.out.printf("   {0}: {1}", ctr, chars[ctr]);
	      }

	  	System.out.println("");
		String[][]  str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new  String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		char[] chArr = {'A','D','C','B','E'};
		
		
		//binarySearch 찾기를 할때 반드시 정렬을 한 후 이용이 가능함
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
		System.out.println("=After sorting =");
		Arrays.sort(chArr);
		System.out.println("chArr=" +Arrays.toString(chArr));
		System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
	}

}
