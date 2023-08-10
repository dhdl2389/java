package 파일연습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class file읽기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> productList = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader("res/cosmeticdata.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				// System.out.println(" 파일을 읽었습니다. ");
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

		for (Product p : productList) {
			System.out.println(p);
		}
	}
}
