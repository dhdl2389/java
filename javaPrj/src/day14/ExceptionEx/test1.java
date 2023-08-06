package day14.ExceptionEx;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMath3 m = new MyMath3();

		Scanner sc = new Scanner(System.in);
		int su1, su2;
		System.out.println("두수를 입력하시오");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		try {
			m.big(su1, su2);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" 첫 수가 더 크네요 ");
		}
		System.out.println("  종료 ");
	}

}
