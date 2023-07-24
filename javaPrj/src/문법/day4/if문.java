package 문법.day4;

public class if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myAge = 26;
		int yourAge = 27;

		if (myAge > yourAge) {
			System.out.println("내가 형이다");
		}
		////////////////////////////////////

		if (myAge > yourAge) {
			System.out.println("내가 형이다");
		} else {
			System.out.println("동갑이거나 니가 형이다");
		}
		////////////////////////////////////

		if (myAge > yourAge) {
			System.out.println("내가 형이다");
		} else if (myAge == yourAge) {
			System.out.println("우린 친구다");
		} else {
			System.out.println("니가 형이다");
		}

	}

}
