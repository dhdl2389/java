package day15;

public class E implements MyRunnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("실행할 코드!");
		for (int i = 1; i <= 5; i++) {
			System.out.println("★");
		}
	}
}
