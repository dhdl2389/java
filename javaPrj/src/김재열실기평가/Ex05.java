package 김재열실기평가;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hi();
		hi2();
	}

	public static void hi2() {
		char[] java2 = new char[10];
		java2[0] = 'h';
		java2[1] = 'e';
		java2[2] = 'l';
		java2[3] = 'l';
		java2[4] = 'o';
		java2[5] = ' ';
		java2[6] = 'j';
		java2[7] = 'a';
		java2[8] = 'v';
		java2[9] = 'a';

		for (int i = 0; i < java2.length; i++) {
			System.out.println(java2[i]);
		}
	}

	public static void hi() {
		char[] java = { 'h', 'e', 'l', 'l', 'o', 'j', 'a', 'v', 'a' };
		System.out.println(java);
	}

}
