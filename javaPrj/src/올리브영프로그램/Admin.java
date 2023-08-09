package 올리브영프로그램;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {

		Cosmetic[] menu = StockPrice_Mng.manageMenu();

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

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("----- 원하는 파트를 고르세요 -----");
			for (int i = 0; i < menu.length; i++) {
				System.out.println((i + 1) + ". " + menu[i].name);
			}
			System.out.println("0. 종료");

			int choice = sc.nextInt();

			if (choice == 0) {
				System.out.println("종료합니다.");
				break;
			} else if (choice >= 1) {
				int categoryIndex = choice - 1;
				Cosmetic selectCategory = menu[categoryIndex];
				selectCategory.showMenu();

				System.out.println(" ");
				System.out.println("1. 재고 및 가격 조회");
				System.out.println("2. 재고 수정");
				System.out.println("3. 가격 수정");

				int stockChoice = sc.nextInt();

				switch (stockChoice) {
				case 1:
					selectCategory.showStock(); // 재고 및 가격 조회
					break;
				case 2:
					Admin_Mng.changeStock(selectCategory); // 재고변경할 상품

					int change = sc.nextInt();

					Admin_Mng.newStock(sc, selectCategory, change); // 변경할 재고수량
					break;
				case 3:
					Admin_Mng.changePrice(selectCategory); // 가격변경할 상품

					change = sc.nextInt();

					Admin_Mng.newPrice(sc, selectCategory, change); // 변경할 상품가격
					break;
				default:
					System.out.println("잘못된 선택입니다.");
					break;
				}
			}
		}
		// 파일저장 위치
		// 파일 저장 위치와 파일명 설정
		String filePath = "res/cosmetic_data.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			for (Product item : productList) {
				String itemInfo = "name:" + item.getName() + ", price:" + item.getPrice() + ", salePrice:"
						+ item.getSalePrice() + ", discount:" + item.getDiscount();
				writer.write(itemInfo);
				writer.newLine();
			}
			System.out.println("파일에 저장되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
