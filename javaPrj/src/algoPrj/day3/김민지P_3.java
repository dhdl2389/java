package algoPrj.day3;

import java.util.Scanner;

public class 김민지P_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 수 ->
		// 입력 -> 출력 (양수의 개수, 음수의 개수, 양수 중 짝수의 개수, 양수 중 홀수의 개수)

		int positive = 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		int i = 0; // 반복제어변수
		int n; // 입력변수

		final int MAX = 5;

		Scanner sc = new Scanner(System.in);

		while (i < MAX) {
			System.out.print("수를 입력하세요");
			n = sc.nextInt();
			if (n > 0) {
				positive++;
				if (n % 2 == 0) { // 짝수인가요?
					even++;
				} else {
					odd++;
				}
			} else {
				negative++;
			}
			i++;

		}
		System.out.println("양수의 개수" + positive);
		System.out.println("음수의 개수" + negative);
		System.out.println("양수중의 짝수의 개수" + even);
		System.out.println("양수중의 음수의 개수" + odd);
	}

}
