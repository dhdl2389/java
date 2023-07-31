package day10.classType;

public class CustomerTest2 {

	public static void main(String[] args) {

		// 자료형이 있으면 자료형 맞는 변수를 만들 수 있어야한다.

		int a;
		a = 10;

		// Customer형 변수를 만들어 봅시다.

		// 참조형변수의 초기값은 null입니다.
		// 참조형변수를 초기화하고 싶을 땐 null로 초기화
		// null => 아무것도 참조하지 않음을 나타내는 값

		Customer customer = null; // customer형 변수가 만들어지지 않았다.
		// customer = new Customer();
		// -> customer 변수가 만들어지지 않음
		// -> 오류발생 (NullPointerException)

		customer.id = "test01";
		customer.pw = "1234";
		customer.name = "홍길동";
		customer.address = "서울시 마포구";

		System.out.println(customer.id);
		System.out.println(customer.pw);
		System.out.println(customer.name);
		System.out.println(customer.address);

	}

}
