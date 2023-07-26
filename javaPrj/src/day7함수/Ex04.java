package day7함수;

public class Ex04 {

	// 함수 : 약속된 함수 (프로그램을 실행하기위해서 약속된 매서드)
	public static void main(String[] args) {
		
		Ex03.printTitle();

		for (int i = 1; i < 4; i++) {
			printTitle();
		}

		System.out.println();

		for (int i = 1; i < 4; i++) {
			printTitle2();
		}

	}

	public static void printTitle() {
		System.out.println("=======");
		System.out.println("==성적표==");
		System.out.println("========");

	}

	public static void printTitle2() {
		System.out.println("********");
		System.out.println("**성적표**");
		System.out.println("********");

	}

}
