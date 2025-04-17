package test;

/*문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. 
my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
*/


public class Ex14 {
	 static int total =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String my_string ="1a2b3c4d123Z";
		System.out.println(solution (my_string));
	}

	public static int solution(String my_string) {
        int sum = 0;       // 전체 합을 저장할 변수
        int num = 0;       // 현재 추출 중인 숫자를 저장할 변수

        // 문자열의 각 문자를 순회합니다.
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            // 만약 문자가 숫자라면 현재 숫자에 이어붙이기 합니다.
            if (Character.isDigit(c)) {
                // 기존 num에 10을 곱한 후 현재 숫자를 더해줍니다.
                num = num * 10 + (c - '0');
            } else {
                // 숫자가 끝났으므로 현재까지의 숫자를 sum에 더하고 num을 초기화합니다.
                sum += num;
                num = 0;
            }
        }
        // 문자열이 끝난 후에도 마지막에 저장된 숫자가 있을 수 있으므로 sum에 추가합니다.
        sum += num;
        
        return sum;
    }

}
