package day9.class자료형;

import java.util.Scanner;

public class leapyear1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 100 != 0 && year % 400 == 0) {
				System.out.println("윤년입니다");
			} else {
				System.out.println("평년입니다.");
			}
		}

	}

}
