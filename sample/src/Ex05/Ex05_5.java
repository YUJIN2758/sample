package Ex05;

import java.util.Arrays;

public class Ex05_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<arr.length; i++) {
			int n = (int)(Math.random()*10); //0~9까지 
			
		   int tmp = arr[i];
		   arr[i] = arr[n];
		   arr[n] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}

	
}
