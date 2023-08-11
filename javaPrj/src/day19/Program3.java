package day19;

public class Program3 {

	public static void main(String[] args) {

		// 책정보를 담을 수 있는 변수를 만드는것
		// 객체라고 부름 1. (구조가 있는 변수) + 변수를 다루는 매서드
		Book book = new Book("자바의 정석", 28000, "도우출판사");
		book.매서드(); // this객체의 정보 전달됨 => this 참조형변수에 저장됨
		
		

	}
}