package ch9;

public class Ex1 {
	 static int anwser =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int anwser =0;
		solution(7,12);
		System.out.println("값은 머야? + "+ anwser);
	}

	 static int solution(int z, int n){
		
		return anwser =n % z == 0 ? (n / z) : (n / z) + 1;
		
	//	n % z == 0 ? (n / z) : (n / z) + 1
	}
}