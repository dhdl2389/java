package day14.ExceptionEx;

public class MyMath3 {

	public boolean big(int su1, int su2) throws NegativeNumberException {

		if (su1 > su2) {
			throw new NegativeNumberException();
		}
		return su1 > su2;

	}
}
