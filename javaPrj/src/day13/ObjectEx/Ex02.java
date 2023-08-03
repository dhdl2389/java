package day13.ObjectEx;

public class Ex02 {

	public static void main(String[] args) {

		B b1 = new B(5);
		B b2 = new B(3);

		// 두개의 객체가 만들어진다.
		// true, false => 생각하기

		if (b1.equals(b2)) { //b1, b2
			System.out.println(" 두 객체는 같습니다. ");
			// 출력안됨 주소값이 다름
		}else
			System.out.println("다르다");

		// Object의 equals는 객체의 reference를 비교한다

	}

}
