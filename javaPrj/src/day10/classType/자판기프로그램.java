package day10.classType;

public class 자판기프로그램 {

	public static void main(String[] args) {

		커피데이터 coffee = null;
		coffee = new 커피데이터();

		printInfo(coffee);
		fillCoffee(coffee);
		printInfo(coffee);

		int money = 10000;
		String result = 밀크커피만들기(coffee, money);
		System.out.println(result);

	}

	public static void printInfo(커피데이터 coffee) {
		System.out.println("< < 현재커피 정보 출력 > >");
		System.out.println(coffee.매출금액);
		System.out.println(coffee.물);
		System.out.println(coffee.설탕);
		System.out.println(coffee.원두);
		System.out.println(coffee.프리마);
	}

	public static void fillCoffee(커피데이터 coffee) {
		coffee.물 += 1000;
		coffee.원두 += 100;
		coffee.설탕 += 100;
		coffee.프리마 += 100;
	}

	public static String 밀크커피만들기(커피데이터 coffee, int 돈) {

		if (돈 >= 100) {
			System.out.println(" 밀크커피 만들기 ");
			coffee.물 -= 10;
			coffee.설탕 -= 20;
			coffee.원두 -= 10;
			coffee.프리마 -= 10;
			return "밀크커피 드세요";
		}
		return "돈 부족";

	}

}
