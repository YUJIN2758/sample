package test;

/*정수로 이루어진 리스트 num_list가 주어집니다. 
 * num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.*/
import java.util.*; // List, ArrayList, Arrays, Collections 등 유틸 클래스 사용

public class Ex_19 {

    // 정수 리스트 num_list에서 가장 작은 5개의 수를 오름차순으로 담아 반환하는 메서드
    public static List<Integer> solution(List<Integer> num_list) {
        // 1. 리스트를 오름차순으로 정렬
        Collections.sort(num_list); // 예: [12, 3, 5, 7, 19, 1, 8, 6] -> [1, 3, 5, 6, 7, 8, 12, 19]

        // 2. 정렬된 리스트에서 가장 작은 5개의 요소를 뽑아 새로운 리스트로 반환
        //    Math.min(5, num_list.size())는 리스트 크기가 5보다 작을 때도 대비하기 위함
        return new ArrayList<>(num_list.subList(0, Math.min(5, num_list.size())));
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        // 3. 테스트용 정수 리스트 생성
        List<Integer> num_list = Arrays.asList(12, 4, 15, 46, 38, 1, 14);

        // 4. solution 메서드 호출 후 결과 출력
        System.out.println(solution(num_list)); // 예상 출력: [1, 3, 5, 6, 7]
    }
}
