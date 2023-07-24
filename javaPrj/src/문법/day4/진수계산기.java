package 문법.day4;

public class 진수계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int decimalNumber = 100000000; // 10진수 숫자를 입력하세요
//		String binaryNumber = Integer.toBinaryString(decimalNumber);
//		System.out.println("10진수 " + decimalNumber + "는 2진수로 " + binaryNumber + "입니다.");
//
//	}

//	public static void second(String[] args) {
		String binaryNumber = "1010111111010101010"; // 2진수 문자열을 입력하세요
		int decimalNumber = Integer.parseInt(binaryNumber, 2);
		System.out.println("2진수 " + binaryNumber + "는 10진수로 " + decimalNumber + "입니다.");
	}

}
