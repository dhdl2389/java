package day8함수;

public class 문자열 {

	public static void main(String[] args) {

		String str = "25";
		char ch = str.charAt(0);
		char ch2 = str.charAt(1);

		int ch_ = ch - 48;
		int ch2_ = ch2 - 48;
		System.out.println();

		System.out.println("앞자리: " + ch_);
		System.out.println("뒷자리: " + ch2_);
	}

}
