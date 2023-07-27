package day8함수;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		int result = getSum3(n);
		System.out.println(result);
		
		int a = result +10;
	}

	private static int getSum3(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;  //반환이 없더라도 함수는 돌아옴
	}

}
