package day14.ExceptionEx;

public class VehicleNoRegException extends Exception {
	public VehicleNoRegException() {
		super("경고 : 하이패스 미차량 등록");
	}
}