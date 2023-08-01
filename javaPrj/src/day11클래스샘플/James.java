package day11클래스샘플;

public class James {

	String name;
	boolean isMarried;
	int age;
	int baby;

	// 기본생성자 (필수는 아님)
	public James() {

	}

	public James(String name, boolean isMarried, int age, int baby) {

		this.name = name;
		this.isMarried = isMarried;
		this.age = age;
		this.baby = baby;
	}

	public String toString() {
		return name + " " + isMarried + " " + age + " " + baby + " ";
	}

}
