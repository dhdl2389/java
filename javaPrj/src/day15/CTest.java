package day15;

public class CTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
		try {
			c.매서드(200);
		} catch (OverNumberException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			// 예외발생하든 하지않든 수행되는 코드
		}

		System.out.println(" 정상종료 ");
	}

}
