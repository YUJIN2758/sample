package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		System.out.println(map);
		map.put("asdf", "1234");
		System.out.println(map);
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해 주세요");
			System.out.println("id:");
			String id = s.nextLine().trim();
			System.out.println("password :");
			String password =s.nextLine().trim();
			System.out.println();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			}
			//key에 대한 값을 가져온다
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
			}else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}//while문 종료
	}// main의 끝

}
