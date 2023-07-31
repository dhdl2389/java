package day10.classType;

import java.util.Scanner;

public class LeapYear {
	Scanner sc = new Scanner(System.in);
	private int year = sc.nextInt();

	public void leapYearCheck() {
		String result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년" : "평년";

		System.out.println(result);

	}

}
