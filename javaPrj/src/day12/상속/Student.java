package day12.상속;

public class Student extends Person {

	int classNo;

	public Student(String name, String id, int classNo) {
		// 값의 초기화 담당
		// super(); //기본적으로 부모의 기본생성자를 호출한다.
		super(name, id);
		this.classNo = classNo;
	}

	public String toString() {
		return name + id + "  " + classNo;
	}
	// new Student ( String name, String id, int classNo);
	// 1. Student

}
