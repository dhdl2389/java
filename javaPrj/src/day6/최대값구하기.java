package day6;

public class 최대값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 8, 3, 7, 11, 9 };

		int MAX = 0;

		for (int i = 0; i < arr.length; i++) {
			if (MAX < arr[i]) {
				MAX = arr[i];
			}
		}
		System.out.println(MAX);
	}

}
