package ch9;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer =0;	
		for (int i=0; i<=1000; i++) {
		
			
			if(i%2 == 0) {
				answer =i + answer;
				System.out.println(answer);
						}
		}
System.out.println(answer);
	}

}
