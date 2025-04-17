package test;

/*머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 
상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 
상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.*/
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] box = {10, 5, 8};
		int  n = 2;
		System.out.println(solution(box,n));
	}
	
	private static int solution(int[] box, int n) {
		  int width = box[0] / n;  // 가로 방향에 들어갈 주사위의 개수
	        int height = box[1] / n; // 세로 방향에 들어갈 주사위의 개수
	        int depth = box[2] / n;  // 높이 방향에 들어갈 주사위의 개수
	        
	        // 주사위가 들어갈 수 있는 최대 개수
	        return width * height * depth;
	    }
	}

