package day7함수;

public class Ex07 {

	public static void printStars(int count) {
		 for (int i = 0; i < count; i++) {
			System.out.print("***");
		}
		System.out.println();
	}

	public static void printMessage() {
		System.out.println("=== 메시지 시작 ===");
		printStars(0); 
		System.out.println("Hello, Java!");
		printStars(5); 
		System.out.println("=== 메시지 끝 ===");
	}

	public static void main(String[] args) {
		printMessage(); 
		int num = Ex08.a(1);
		System.out.println(num);
	}
}
