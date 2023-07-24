package algoPrj.day3;

public class 곽단야P_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		int sum = 0; // 누적합

		// 처리
		int jsum = 0;

		int i = 1; // 반복을 제어하는 변수
		int j = i - 1; // j=0

		final int MAX = 5;

		while (i <= MAX) {
			j = i;
			jsum = jsum + j; // jsum+=j;
			sum = sum + jsum;
			i++;

		}
		System.out.println(sum);

	}

}
