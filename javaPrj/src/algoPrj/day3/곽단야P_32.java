package algoPrj.day3;

public class 곽단야P_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		int sum = 0; // 누적합

		// 처리
		int jsum = 0; // 항을 구할 변수
		int i = 1; // 반복을 제어하는 변수

		final int MAX = 5;

		while (i <= MAX) {

			jsum = jsum + i; // jsum+=j;
			sum = sum + jsum;
			i++;

		}
		System.out.println(sum);

	}

}
