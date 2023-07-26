package day6;

import java.util.Arrays;
import java.util.Scanner;

public class 화폐단위구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		System.out.println("급여를 입력하세용");

		int money1 = (money / 50000); // 오만원
		int money2 = (money % 50000) / 10000; // 만원
		int money3 = (money % 10000) / 5000; // 오천원
		int money4 = (money % 5000) / 1000; // 천원
		int money5 = (money % 1000) / 500; // 오백원
		int money6 = (money % 500) / 100; // 백원
		int money7 = (money % 100) / 50; // 오십원
		int money8 = (money % 50) / 10; // 십원

		System.out.println(money1 + " " + money2 + " " + money3 + " " + money4 + " " + money5 + " " + money6 + " "
				+ money7 + " " + money8);

		int[] mon = new int[8];

		int[] mon1 = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		for (int i = 0; i < mon.length; i++) {
			mon[i] = money / mon1[i];
			money %= mon1[i];
		}
		
		for (int count : mon) {
			System.out.print(count + " ");
		}

		System.out.println();

		int mon2 = sc.nextInt();
		for (int i = 0; i < mon.length; i++) {
			mon[i] = mon2 / mon1[i];
			mon2 %= mon1[i];
		}
		System.out.println(Arrays.toString(mon1));
		System.out.println(Arrays.toString(mon));
	
		
	}
	


}
