package 문법.day4;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch,
		// while, for 반복문 break;
		// 자신이 속한 반복문을 빠져나옴

		// 1~10까지의 합

		int i = 0;
		int sum = 0;
		while (true) { // 무한반복, 탈출조건 반드시 존재
			i++;
			sum += i;
			if (i >= 10)
				break;

		}
		System.out.println(sum);

	}

}
