package day9.class자료형;

import java.util.Scanner;

public class 일정관리 {
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
				System.out.println("일정을 입력하세요");
				String day = sc.nextLine();
				days[index] = day;
				index++;
				break;

			case 2:
				System.out.println("일정을 조회합니다. ");
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ":" + days[i]);
				}
				break;

			case 3:
				System.out.println(" 변경");

				System.out.println("일정을 조회합니다. ");
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ":" + days[i]);
				}

				System.out.println("변경할 순번과 내용을 입력하세요");
				String updateIndex_ = sc.nextLine();
				int updateIndex = Integer.parseInt(updateIndex_);

				String updateDay = sc.nextLine();
				days[updateIndex - 1] = updateDay;
				break;

			case 4:
				System.out.println(" 삭제");
				System.out.println("일정을 조회합니다. ");
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ":" + days[i]);
				}
				System.out.println("삭제하고 싶은 일정을 선택하세요");
				String deleteIndex_ = sc.nextLine();
				int deleteIndex = Integer.parseInt(deleteIndex_); // 숫자로 변경해주는 기능
				days[deleteIndex - 1] = "";
				break;

			case 5:
				System.out.println(" 종료");
				break loop;

			default:
				System.out.println("잘못된 입력");
			}

		} // while

		System.out.println(" bye");
	} // main 종료

}
