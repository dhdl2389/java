package 문법.day4;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int su;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		su = sc.nextInt();

		for (int i = 1; i <= su; i++) {
			sum += su;
		}
		System.out.println(sum);

	}

}
