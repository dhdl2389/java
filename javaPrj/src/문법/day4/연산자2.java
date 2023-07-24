package 문법.day4;

public class 연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a++, ++a, a--, --a

		int a = 10;
		int b = 10;

		int resulta;
		int resultb;

		resulta = a++;
		resultb = ++b;

		System.out.println(a); // 11
		System.out.println(b); // 11

		System.out.println(resulta); // 10
		System.out.println(resultb); // 11

		int c = 10;
		int d = 10;
		int resultc;
		int resultd;

		resultc = c--;
		resultd = --d;

		System.out.println(c);
		System.out.println(d);

		System.out.println(resultc);
		System.out.println(resultd);

		// 문제
		// int result = a++ + --b + c++ - d--;

		// result?
		// 21

	}

}
