package day5;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 배열 [행][열]

		// String[][] favorites = new String[2][5];
		String[][] favorites = { { "시간", "돈", "지갑", "차", "집" }, { "사랑", "우정", "행복", "슬픔", "행복" } };

		System.out.println(favorites[0][0]);
		System.out.println(favorites[0][1]);
		System.out.println(favorites[0][2]);
		System.out.println(favorites[0][3]);
		System.out.println(favorites[0][4]);

		System.out.println(favorites[1][0]);
		System.out.println(favorites[1][1]);
		System.out.println(favorites[1][2]);
		System.out.println(favorites[1][3]);
		System.out.println(favorites[1][4]);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(favorites[i][j]);
			}

		}

	}

}
