package 문법.day4;

import java.util.Scanner;

public class BreakEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메뉴 1.등록, 2. 조회, 3.변경, 4.삭제 5.종료

		Scanner sc = new Scanner(System.in);

		int menu;
		System.out.println("메뉴 1.등록, 2. 조회, 3.변경, 4.삭제 5.종료");
		menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("등록");
			break;
		case 2:
			System.out.println("조회");
			break;
		case 3:
			System.out.println("변경");
			break;
		case 4:
			System.out.println("삭제");
			break;
		case 5:
			System.out.println("종료");
			break;
		default:
			System.out.println("잘못된 선택");

		}

		// 반복문 사용하기

		loop: while (true) {
			System.out.println("메뉴 1.등록, 2. 조회, 3.변경, 4.삭제 5.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("등록");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println("변경");
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 5:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못된 선택");

			}
		}

	}

}
