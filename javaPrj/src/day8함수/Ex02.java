package day8함수;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		getSum2(n);
		
	}


	private static void getSum2(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
