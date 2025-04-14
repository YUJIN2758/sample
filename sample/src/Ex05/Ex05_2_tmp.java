package Ex05;

import java.util.Arrays;

public class Ex05_2_tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,1,2,0,3};
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String [][] str2D = {{"aaa","bbb"}, {"AAA","BBB"}};
		String [][] str2D2 ={{"aaa","bbb"}, {"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D));
		
		int[] arr2 =Arrays.copyOf(arr, 7);
		int[] arr3 =Arrays.copyOfRange(arr, 2,4);
		System.out.println(Arrays.toString(arr2));

		System.out.println(Arrays.toString(arr3));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
