package day8함수;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getSum();
		getSum(); // 함수호출
	}

	//반환값이 없다 void
	// 반환 type 함수명 () //(입력정보)
	private static void getSum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
