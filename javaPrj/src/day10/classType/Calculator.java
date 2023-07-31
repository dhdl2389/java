package day10.classType;

public class Calculator {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtraction(int a, int b) {
		return a - b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static double division(double a, double b) {
		if (b == 0) {
			System.out.println("0으로 나눌 수 없다");
		}
		return a / b;
	}
}
