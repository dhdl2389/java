package day20.thread;

public class test {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 5; i > 0; i--) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i * 2 - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
