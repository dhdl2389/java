package day12.상속;

public class a {

	String name;
	String id;

	public a() {
		this("아무개", "none");
	}

	public a(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return name + id;
	}

}
