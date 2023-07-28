package day9.class자료형;

public class Introduce2 {

	public static void main(String[] args) {

		//
		int a;
		// 자료형 변수;
		// 배열, 객체는 메모리에 공간을 확보하는 행위를 할 때 new로 힙메모리 사용 강제되어 있다.

		Introduce I = new Introduce();
		I.age = 40;
		I.name = "James";
		I.isMarried = true;
		I.baby = 3;

		System.out.println(I.age + " " + I.name + " " + I.isMarried + " " + I.baby);

	}

}
