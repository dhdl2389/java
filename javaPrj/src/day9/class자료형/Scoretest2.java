package day9.class자료형;

import java.util.Scanner;

public class Scoretest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score sc = new Score();
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		sc.name = scanner.nextLine();

		System.out.println("국어 성적을 입력하세요");
		sc.kor = scanner.nextInt();

		System.out.println("영어 성적을 입력하세요");
		sc.eng = scanner.nextInt();

		sc.avg = (sc.kor + sc.eng) / 2;
		System.out.println("당신의 국어 영어 평균은" + sc.avg + " 입니다");
		
		int menu;
		loop: while (true) {
			System.out.println("메뉴선택 :  1. 성적등록, 2. 조회, 3.종료");
		}

	}

}
