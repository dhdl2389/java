package day14.ExceptionEx;

public class MyMath1 {

	public int add(int num1, int num2) throws NegativeNumberException {

		if (num1 < 0 || num2 < 0) {
			// 예외 발생 시키기 ( 일으키다 )
			// 예외 발생 시키는 키워드 throw
			throw new NegativeNumberException();
		}
		return num1 + num2;
	}
}
