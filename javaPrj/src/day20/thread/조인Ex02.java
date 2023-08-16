package day20.thread;

public class 조인Ex02 {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println((i + 1) + "hi");
				}
			}
		});

		th.start();
		try {
			th.join(); // 메인스레드에서 th스레드가 작업이 완료될 때 까지 기다린다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인종료");
	}
}
