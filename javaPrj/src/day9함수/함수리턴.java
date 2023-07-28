package day9함수;

public class 함수리턴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 9, 8, 7 };
		printArray(arr); // 호출되면 코드를 수행하고 호출한 쪽으로 돌아옴

	}

	public static void printArray(int[] a) {
		for (int number : a) {
			System.out.print(number);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

}
