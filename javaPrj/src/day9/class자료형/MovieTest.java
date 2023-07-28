package day9.class자료형;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie m = new Movie();

		m.title = "범죄도시";
		m.audience = 10000000;
		m.grade = 4.5;

		System.out.println(m.title + " " + m.audience + " " + m.grade);

		Movie m1 = new Movie();
		m1.title = "투사부일체";
		m1.audience = 5000000;
		m1.grade = 3.5;

		System.out.println(m1.title + " " + m.audience + " " + m.grade);
		
		
	}

}
