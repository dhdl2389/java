package day5;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] even = new int[3][3];

		even[0][0] = 2;
		even[0][1] = 4;
		even[0][2] = 6;

		even[1][0] = 8;
		even[1][1] = 10;
		even[1][2] = 12;

		even[2][0] = 14;
		even[2][1] = 16;
		even[2][2] = 18;

		for (int i = 0; i < even.length; i++) {
			for (int j = 0; j < even[i].length; j++) {
				System.out.print(even[i][j] + " ");
			}
		}

		int[][] odd = new int[3][3];

		odd[0][0] = 1;
		odd[0][1] = 3;
		odd[0][2] = 5;

		odd[1][0] = 7;
		odd[1][1] = 9;
		odd[1][2] = 11;

		odd[2][0] = 13;
		odd[2][1] = 15;
		odd[2][2] = 17;

		System.out.println("\n" + "----------------------");
		int v = 1;
		for (int i = 0; i < odd.length; i++) {
			for (int j = 0; j < odd[i].length; j++) {
				odd[i][j] = v;
				v += 2;
			}
		}

		for (int i = 0; i < odd.length; i++) {
			for (int j = 0; j < odd[i].length; j++) {
				System.out.println(odd[i][j] + " ");
			}
			System.out.println();
		}

	}

}
