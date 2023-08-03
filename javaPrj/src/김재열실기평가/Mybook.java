package 김재열실기평가;

public class Mybook extends Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book a = new Book("AA1001", "SpringMVC", "최작가");
		Book b = new Book("BB1001", "JSP/Sevlet 웹프로그래밍", "이작가");
		Book c = new Book("CC01", "MVC2", "박작가");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
