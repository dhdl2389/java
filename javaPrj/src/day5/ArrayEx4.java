package day5;

public class ArrayEx4 {

	public static void main(String[] args) {

		int[][] even = { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 } };
		int[][] odd = { { 3, 5, 7 }, { 9, 11, 13 }, { 15, 17, 19 } };

		for (int i = 0; i < even.length; i++) {
			for (int j = 0; j < even[i].length; j++) {
				System.out.println(even[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < odd.length; i++) {
			for (int j = 0; j < odd[i].length; j++) {
				System.out.println(odd[i][j] + " ");
			}
			System.out.println();
		}

	}

}
