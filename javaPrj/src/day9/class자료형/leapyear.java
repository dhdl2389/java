package day9.class자료형;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하시오");
		String input = sc.nextLine();

		int year = Integer.parseInt(input);

		String result = year % 4 == 0 && year % 100 == 0 || year % 400 == 0 ? "윤년" : "평년";
		System.out.println(result);

	}

}
