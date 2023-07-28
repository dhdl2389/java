package day9함수;

public class CallByReference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] kors = new int[3];

		// 등록
		day(kors);

		// 조회
		checkday(kors);

	}

	public static void day(int[] kors) {
		kors[0] = 5;
		kors[1] = 8;
		kors[2] = 9;
	}

	public static void checkday(int[] kors) {
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[3]);
	}

	//

}
