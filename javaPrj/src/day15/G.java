package day15;

public class G implements MyRunnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println(("4단출력"));

		for (int i = 1; i <= 9; i++) {
			System.out.println(4 * i);
		}
	}

}
