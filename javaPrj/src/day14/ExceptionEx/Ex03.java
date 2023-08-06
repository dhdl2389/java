package day14.ExceptionEx;

import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 한 바이트만읽어온다 ( 아스키 코드 읽어옴 )
		// 예외가 발생햇을 때 프로그래머가 해야하는것은 대비코드를 작성하는 것!!

		try {
			int a = System.in.read();
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			e.getMessage();
			System.out.println(" 대비코드 !!! ");

			// System.exit(0);
		}
	}

}
