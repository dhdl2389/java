package algoPrj.day3;

public class 이윤P_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 항의순번 1 2 3 4 5 6
		// 항 1+3+5+7+9+11...99 합을 구하시오

		int n = 1;
		int sum = 0;
		final int MAX = 11;

		while (n <= MAX) {
			sum += n;
			n += 2; // n=n+2;
		}
		System.out.println(sum);
	}

}
