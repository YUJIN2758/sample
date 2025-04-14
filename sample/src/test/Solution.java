package test;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		solution(1234);
	}

	 public static int solution(int n) {
	        int answer = 0;
	        
	        while(n > 0){
	            answer += n%10;
	         //   System.out.println("이밧은 머갸" + answer);
	           // n/=10;
	            n = n/10;
	            System.out.println("n값은 머니?" + n);
	        }
	        System.out.println(answer);
	        return answer;
	  
	    }
}


