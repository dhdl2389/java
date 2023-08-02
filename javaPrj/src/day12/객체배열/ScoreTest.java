package day12.객체배열;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score s1 = new Score("01", 100, 90, 50);
		Score s2 = new Score("03", 90, 80, 60);
		Score s3 = new Score("02", 80, 70, 70);

		//System.out.println(s1.toString()); // toString() 생략가능함
		//System.out.println(s2);
		//System.out.println(s3);

		// s1, s2, s3 와 같이 참조형변수를 배열로 만든것!!
		// 참조형변수와 기본값 null로 초기화됨
		Score[] arr = new Score[3]; // Score 객체가 만들어지지 않음!!
		// String result = arr[0].toString();
		// nullPonterException

		arr[0] = new Score("01", 100, 90, 50);
		arr[1] = new Score("03", 90, 80, 60);
		arr[2] = new Score("02", 80, 70, 70);

		for (Score score : arr) {
			System.out.println(score);
			System.out.println(score.toString());
		}

	}

}
