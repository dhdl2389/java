package 김재열실기평가;

import java.util.Scanner;

import day10.classType.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("수입력");
		int num1 = sc.nextInt();

		System.out.println("수입력");
		int num2 = sc.nextInt();

		int resultMultiplication = Calculator.multiplication(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + resultMultiplication);

	}

}
