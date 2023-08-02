package day12.상속;

public class b extends a {

	int classNo;

	public b(String name, String id, int classNo) {
		super(name, id);
		this.classNo = classNo;
	}

	public String toString() {
		return name + " " + id + " " + classNo;
	}
}
