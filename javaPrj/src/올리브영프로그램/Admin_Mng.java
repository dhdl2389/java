package 올리브영프로그램;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin_Mng {
	public static void newPrice(Scanner sc, Cosmetic selectCategory, int change) {
		if (change >= 1 && change <= selectCategory.products.length) {
			System.out.println("새로운 할인 가격을 입력하세요:");
			int newDiscountPrice = sc.nextInt();
			selectCategory.products[change - 1].discountedPrice = newDiscountPrice;
			System.out.println(
					selectCategory.products[change - 1].name + "의 할인 가격이 " + newDiscountPrice + "원으로 수정되었습니다.");
		} else {
			System.out.println("없는 번호입니다.");
		}
	}

	public static void changePrice(Cosmetic selectCategory) {
		System.out.println(selectCategory.name + "의 가격을 수정할 화장품 번호를 선택하세요:");
		System.out.println();
		for (int i = 0; i < selectCategory.products.length; i++) {
			System.out.println((i + 1) + ":" + selectCategory.products[i].name);
		}
	}

	public static void newStock(Scanner sc, Cosmetic selectCategory, int change) {
		if (change >= 1 && change <= selectCategory.products.length) {
			System.out.println("새로운 재고 수량을 입력하세요:");
			int newStock = sc.nextInt();
			selectCategory.changeStock(change - 1, newStock);
		} else {
			System.out.println("없는 번호입니다.");
		}
	}

	public static void changeStock(Cosmetic selectCategory) {
		System.out.println(selectCategory.name + "의 재고를 수정할 화장품 번호를 선택하세요:");
		System.out.println();
		for (int i = 0; i < selectCategory.products.length; i++) {
			System.out.println((i + 1) + ":" + selectCategory.products[i].name);
		}
	}

	public static void readFile() { // 파일읽기
		ArrayList<Product> productList = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("res/cosmetic_data.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(", ");
				String name = data[0].split(":")[1];
				int price = Integer.parseInt(data[1].split(":")[1]);
				int salePrice = Integer.parseInt(data[2].split(":")[1]);
				int discount = Integer.parseInt(data[3].split(":")[1]);
				productList.add(new Product(name, price, salePrice, discount));
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) { 
			System.out.println("파일 읽기 오류: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 오류: " + e.getMessage());
		}
	}
}
