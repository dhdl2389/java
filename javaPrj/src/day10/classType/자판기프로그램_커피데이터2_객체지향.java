package day10.classType;

public class 자판기프로그램_커피데이터2_객체지향 {

	public static void main(String[] args) {

		커피데이터2 coffee = null;
		coffee = new 커피데이터2();

		// printInfo(coffee);
		coffee.printInfo(); //

		// fillCoffee(coffee);
		coffee.fillCoffee();

		int money = 10000;
		String result = coffee.밀크커피만들기(money);
		System.out.println(result);

	}

}
