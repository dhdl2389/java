package day8함수;

import java.util.Scanner;

public class 함수만들기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 쌍다이아

		// 다이아 별
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println();
		// 위에 별
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) { // 별
				System.out.print("*");

			}
			for (int j = 2 * n; j > 2 * i + 1; j--) {// 공백
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				if (i == n  && j == 2 * i) {
					continue;
				} else {
					System.out.print("*");
				}

			}

			System.out.println();
		}
		// 아래별
		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j < n - i - 1; j++) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {// 별
				System.out.print("*");
			}
			for (int j = 2 * n; j > 2 * i + 1; j--) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) { // 별
				System.out.print("*");

			}

			System.out.println();
		}

	}

}
