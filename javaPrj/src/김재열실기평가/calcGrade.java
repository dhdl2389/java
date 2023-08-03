package 김재열실기평가;

public class calcGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score a = new Score("이학생", 90, 90);
		Score b = new Score("김학생", 80, 82);
		Score c = new Score("전학생", 60, 70);


		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}

}
