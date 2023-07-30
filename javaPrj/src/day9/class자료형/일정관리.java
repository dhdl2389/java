package day9.class자료형;

import java.util.Scanner;

public class 일정관리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] days = new String[10][10];

		int index = 0;

		loop: while (true) {
			System.out.print("메뉴선택: 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료 ");

			String menu_ = sc.nextLine();
			int menu = Integer.parseInt(menu_);

			switch (menu) {
			case 1:
				System.out.println("일정을 입력하세요");
				String day = sc.nextLine();
				System.out.println("일정을 같이 할 사람의 이름을 입력하세요");
				String friend = sc.nextLine();
				days[index][0] = day;
				days[index][1] = friend;
				index++;

				break;

			case 2:
				System.out.println("일정을 조회합니다.");
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ": " + days[i][0] + ", " + days[i][1]);
				}
				break;

			case 3:
				System.out.println("변경");
				System.out.println("일정을 조회합니다.");
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ": " + days[i][0] + ", " + days[i][1]);
				}

				System.out.println("변경할 순번과 내용을 입력하세요");
				String updateIndex_ = sc.nextLine();
				int updateIndex = Integer.parseInt(updateIndex_);

				System.out.println("새로운 일정을 입력하세요");
				String updateDay = sc.nextLine();
				System.out.println("일정을 같이 할 사람의 이름을 입력하세요");
				String updateFriend = sc.nextLine();

				days[updateIndex - 1][0] = updateDay;
				days[updateIndex - 1][1] = updateFriend;

				break;

			case 4:
				System.out.println("삭제");
				System.out.println("일정을 조회합니다.");
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ": " + days[i][0] + ", " + days[i][1]); // info를 friend로 수정
				}
				System.out.println("삭제하고 싶은 일정의 순번을 선택하세요");
				String deleteIndex_ = sc.nextLine();
				int deleteIndex = Integer.parseInt(deleteIndex_);
				days[deleteIndex - 1][0] = "";
				days[deleteIndex - 1][1] = "";

				break;

			case 5:
				System.out.println(" 종료");
				break loop;

			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		System.out.println(" bye");
	}

}
