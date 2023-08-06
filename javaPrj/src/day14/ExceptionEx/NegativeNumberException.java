package day14.ExceptionEx;


//Exception ( 필수 )
public class NegativeNumberException extends Exception {

	public NegativeNumberException() {
		//
		super("음수이면 안된다");
	}

}
