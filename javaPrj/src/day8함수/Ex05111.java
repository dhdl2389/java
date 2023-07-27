package day8함수;

import java.util.Scanner;

public class Ex05111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] moneyArr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] moneyArrMain = new int[moneyArr.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("출장비입력: ");
		int money = sc.nextInt();

		for (int i = 0; i < moneyArr.length; i++) {
			moneyArrMain[i] = money / moneyArr[i];
			money %= moneyArr[i];
		}

		System.out.print("돈 매수 구하기: ");
		for (int i = 0; i < moneyArrMain.length; i++) {
			System.out.print(moneyArrMain[i] + " ");
		}

	}

}
