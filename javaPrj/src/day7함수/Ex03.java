package day7함수;

public class Ex03 {

	// 함수 : 약속된 함수 (프로그램을 실행하기위해서 약속된 매서드)
	public static void main(String[] args) { // 시작

		// 함수를 이용한 성적표타이틀 출력하기
		// 요구사항 =모양 -> *모양으로 변경
		printTitle(); // 함수호출 (호출하지 않은 코드는 실행이 안됨)
		printTitle();
		printTitle();

	} // 끝

	// 함수
	// printTitle : 함수명 ( 기능이름 : 기능에 맞게 이름을 작성
	// 기능1 : 특정기능을 수행하는 코드블럭
	// 기능2 : 코드의 중복을 제거할 목적으로, 코드의 분할 ( 너무 긴 코드는 오류를 발견하거나 수정하기 힘들다)
	// 기능3 : 협업( 코드를 나눠서 작업할 때 )
	// 기능4 : 성적표의 타이틀 출력하는 기능
	// 입력 : 입력으로 받는 값
	// 반환값 : 기능을 수행하고 반환하는 값

	// 함수사용 : 함수호출 이용해서 함수코드 실행함 , ()괄호 반드시 표시해야함
	// 함수호출 예시 ) printTitle();
	public static void printTitle() {
		System.out.println("==성적표==");
		System.out.println("========");
		System.out.println("========");

	}

}
