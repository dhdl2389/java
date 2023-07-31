package day10.classType;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;

		int resultAdd = Calculator.add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + resultAdd);

		int resultSubtraction = Calculator.subtraction(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + resultSubtraction);

		int resultMultiplication = Calculator.multiplication(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + resultMultiplication);

		double resultDivision = Calculator.division(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + resultDivision);

	}
}