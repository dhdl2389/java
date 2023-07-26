package day7함수;

public class Ex05 {

	public static void main(String[] args) {

		printTitle();

		System.out.println("코드 실행");

		Ex03.printTitle();

		System.out.println("코드 실행");

		printTitle();

		System.out.println("코드 실행");

		printTitle();
	}

	public static void printTitle() {
		System.out.println("////////");
		System.out.println("**성적표**");
		System.out.println("////////");
	}
}
