package 프로젝트_올리브영;

import java.util.Scanner;

public class 재고확인_수정2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] categories = { "기초화장품", "색조화장품", "향수", "일회용품" };

		String[] basicCosmetic = { "로션", "스킨", "에센스", "선크림", "토너" };
		int[] basicStock = { 10, 20, 15, 5, 8 };

		String[] colorCosmetic = { "립", "마스카라", "BB크림", "파운데이션", "블러셔" };
		int[] colorStock = { 12, 7, 10, 18, 6 };

		String[] perfumeCosmetic = { "플로럴", "우디", "시트러스", "오리엔탈", "프루티" };
		int[] perfumeStock = { 3, 6, 2, 8, 4 };

		String[] disposableCosmetic = { "화장솜", "마스크팩", "화장지", "기저귀", "면도기" };
		int[] disposableStock = { 50, 40, 30, 25, 35 };

		//
		Cosmetics cosmetic1 = new Cosmetics(" 기초화장품 ", basicCosmetic, basicStock);
		Cosmetics cosmetic2 = new Cosmetics(" 색조화장품 ", colorCosmetic, colorStock);
		Cosmetics cosmetic3 = new Cosmetics(" 향수화장품 ", perfumeCosmetic, perfumeStock);
		Cosmetics cosmetic4 = new Cosmetics(" 일회용품 ", disposableCosmetic, disposableStock);

		//
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(" -----원하는 파트를 고르세요----- ");
			for (int i = 0; i < categories.length; i++) {
				System.out.println((i + 1) + ". " + categories[i]);
			}
			System.out.println("0. 종료");

			int choice = sc.nextInt();

			if (choice == 0) {
				System.out.println("종료합니다.");
				break;
			} else if (choice >= 1 && choice <= categories.length) {
				int categoryIndex = choice - 1;
				String selectedCosmetics = categories[categoryIndex];
				Cosmetics.displayInfo(selectedCosmetics);

				System.out.println("1. 재고 조회");
				System.out.println("2. 재고 수정");

				int stockChoice = sc.nextInt();

				if (stockChoice == 1) {
					System.out.println(selectedCosmetics + "의 재고는");
					int[] selectedStock = null;
					String[] selectedCosmetic = null;

					if (categoryIndex == 0) {
						selectedStock = basicStock;
						selectedCosmetic = basicCosmetic;
					} else if (categoryIndex == 1) {
						selectedStock = colorStock;
						selectedCosmetic = colorCosmetic;
					} else if (categoryIndex == 2) {
						selectedStock = perfumeStock;
						selectedCosmetic = perfumeCosmetic;
					} else if (categoryIndex == 3) {
						selectedStock = disposableStock;
						selectedCosmetic = disposableCosmetic;
					}

					for (int i = 0; i < selectedStock.length; i++) {
						System.out.println(selectedCosmetic[i] + " = " + selectedStock[i] + "개 입니다.");
					}
				} else if (stockChoice == 2) {
					System.out.println(selectedCosmetics + "의 재고를 수정할 화장품 번호를 선택하세요:");
					int[] selectedStock = null;
					String[] selectedCosmetic = null;

					if (categoryIndex == 0) {
						selectedStock = basicStock;
						selectedCosmetic = basicCosmetic;
					} else if (categoryIndex == 1) {
						selectedStock = colorStock;
						selectedCosmetic = colorCosmetic;
					} else if (categoryIndex == 2) {
						selectedStock = perfumeStock;
						selectedCosmetic = perfumeCosmetic;
					} else if (categoryIndex == 3) {
						selectedStock = disposableStock;
						selectedCosmetic = disposableCosmetic;
					}

					for (int i = 0; i < selectedStock.length; i++) {
						System.out.println((i + 1) + ":" + selectedCosmetic[i]);
					}

					int typeIndex = sc.nextInt();

					if (typeIndex >= 1 && typeIndex <= selectedStock.length) {
						System.out.println("새로운 재고 수량을 입력하세요:");
						int newStock = sc.nextInt();
						selectedStock[typeIndex - 1] = newStock;
						System.out.println(selectedCosmetic[typeIndex - 1] + "의 재고가 " + newStock + "개로 수정되었습니다.");
					} else {
						System.out.println("유효하지 않은 화장품 번호입니다.");
					}
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	}

}
