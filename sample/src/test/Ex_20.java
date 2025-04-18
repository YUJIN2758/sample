package test;
//1111111111111111111111111111111

/*1. 워킹 디렉토리 (Working Directory)
현재 작업 중인 폴더야.
코드를 수정하거나 새 파일을 만들면 여기에 반영돼.

2. 스테이징 영역 (Staging Area, Index)
커밋하기 전에 임시 저장소야.
"어떤 파일을 커밋할지" 선택하는 단계야.
git add를 하면 워킹 디렉토리에서 변경된 내용을 스테이징에 올리는 거야.

3. 커밋 (Commit)
스테이징 영역에 있는 파일을 하나의 버전(스냅샷) 으로 저장하는 행위야.
메시지를 달아서 "이 시점에 이런 작업을 했다"는 기록을 남기는 거지.

워킹 디렉토리: 요리 재료들
스테이징 영역: 접시에 담은 재료들
커밋: 사진 찍기 (요리 결과를 저장)
→ 어떤 재료(파일)를 사진에 남길지 add로 고르고, commit으로 저장하는 거야!

<작업순서>
로컬에서 작업
git add → 스테이징
git commit → 버전 저장
git push → GitHub에 업로드

==================================================================== */
/*🔹 1. --soft
무엇을 되돌림? 커밋만 되돌리고, 스테이지(index)와 워킹 디렉토리는 그대로 둠.
어떨 때 사용? 최근 커밋을 되돌리고 다시 커밋 메시지를 바꾸고 싶을 때.

🔹 2. --mixed (기본값)
무엇을 되돌림? 커밋과 스테이지만 되돌리고, 워킹 디렉토리는 그대로 둠.

어떨 때 사용? 최근 커밋을 없애고, 스테이지도 초기화하되 파일 내용은 그대로 둘 때.

3. --hard
무엇을 되돌림? 커밋, 스테이지, 워킹 디렉토리 모두 되돌림 (파일 수정 내용까지 완전 삭제됨).

어떨 때 사용? 모든 변경을 완전히 되돌리고, 깨끗하게 이전 상태로 돌아가고 싶을 때.
*/

public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
