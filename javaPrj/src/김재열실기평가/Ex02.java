package 김재열실기평가;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = getTotal();
		System.out.println(sum);
	}

	public static int getTotal() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 수를 입력하시오 ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

}
