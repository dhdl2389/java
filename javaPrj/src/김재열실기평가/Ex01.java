package 김재열실기평가;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 단을 입력하세요");
		int num = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(i * num);
		}

	}

}
