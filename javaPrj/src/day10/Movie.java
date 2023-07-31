package day10;

import java.util.Scanner;

public class Movie {
	static String[] days = new String[10];
	static int index = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 일정을 관리하는 프로그램 작성 ( 일정10개 )
		//

		int menu;
		loop: while (true) {
			System.out.print("메뉴선택:  1.등록 , 2조회, 3.변경, 4.삭제 , 5.종료 ");

			String menu_ = sc.nextLine();
			menu = Integer.parseInt(menu_);

			switch (menu) {
			case 1:
				insertDays();
				break;
			case 2:
				selectDays();
				break;
			case 3:
				updateDays();
				// 1 공부하기
				break;

			case 4:
				System.out.println(" 종료");
				break loop;

			default:
				System.out.println("잘못된 입력");
			}

		} // while

		System.out.println(" bye");
	} // main 종료

	private static void updateDays() {
		System.out.println(" 변경");

		selectDays();

		System.out.println("변경할 순번과 내용을 입력하세요");
		String updateIndex_ = sc.nextLine();
		int updateIndex = Integer.parseInt(updateIndex_);

		String updateDay = sc.nextLine();
		days[updateIndex - 1] = updateDay;
	}

	private static void insertDays() {
		System.out.println("일정을 입력하세요");
		String day = sc.nextLine();
		days[index] = day;
		index++;
	}

	private static void selectDays() {
		System.out.println("일정을 조회합니다. ");
		for (int i = 0; i < index; i++) {
			System.out.println((i + 1) + ":" + days[i]);
		}
	}

}
