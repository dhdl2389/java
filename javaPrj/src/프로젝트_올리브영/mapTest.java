package 프로젝트_올리브영;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapTest {

	private static final String categories = null;
	private static final int[] basicStock = null;
	private static final String[] basicCosmetic = null;
	private static final int[] colorStock = null;
	private static final String[] colorCosmetic = null;
	private static final int[] perfumeStock = null;
	private static final String[] perfumeCosmetic = null;
	private static final int[] disposableStock = null;
	private static final String[] disposableCosmetic = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 각 카테고리에 해당하는 화장품과 재고를 저장하는 HashMap
		Map<String, Cosmetics> cosmeticsMap = new HashMap<>();

		// Stock.txt 파일 경로
		String fileName = "res/Stock.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				String category = parts[0].trim();
				String cosmetic = parts[1].trim();
				int stock = Integer.parseInt(parts[2].trim());

				if (!cosmeticsMap.containsKey(category)) {
					cosmeticsMap.put(category, new Cosmetics(category, new String[5], new int[5]));
				}

				Cosmetics cosmetics = cosmeticsMap.get(category);
				cosmetics.addCosmetic(cosmetic, stock);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.err.println("파일 데이터 형식이 올바르지 않습니다. 재고량은 숫자로 입력되어야 합니다.");
			e.printStackTrace();
			return;
		}
		String[] categories = { "기초화장품", "색조화장품", "향수", "일회용품" };
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
