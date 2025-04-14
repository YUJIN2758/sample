package test;

import java.util.Arrays;

public class Solution2 {

	public static void main(String[] args) {
		solution(54321);
	}

	private static int[] solution(long n) {
		// TODO Auto-generated method stub
		   String str=Long.toString(n);
		   
	        int[] answer = new int[str.length()];
	        
	        int index = 0;
	        while(n>0){
	            answer[index++] = (int)(n%10);
	            n/=10;
	        }
	        System.out.println(Arrays.toString(answer));
	        return answer;
	}

	
}

/*
 * class SolutionT { public int[] solution(long n) {
 * 
 * String str=Long.toString(n); int[] answer = new int[str.length()];
 * 
 * int index = 0; while(n>0){ answer[index++] = (int)(n%10); n/=10; }
 * System.out.println(answer); return answer; } }
 */