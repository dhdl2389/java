package 문법.day4;

import java.util.Scanner;

public class EX00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String menu;
		int qty;
		int amount;
		int 아메리카노 = 2000;
		int 카푸치노 = 2900;
		int 모카라떼 = 3200;

		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴의 수량을 입력하시오");
		menu = sc.next();
		qty = sc.nextInt();

		switch (menu) {
		case "아메리카노":
			amount = 아메리카노 * qty;
			break;
		case "카푸치노":
			amount = 카푸치노 * qty;
			break;
		case "모카라떼":
			amount = 모카라떼 * qty;
			break;
		default:
			System.out.println("없는 메뉴");
			amount = 0;

		}
		System.out.println(amount);

	}

}
