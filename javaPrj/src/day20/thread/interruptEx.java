package day20.thread;

public class interruptEx {

	public static void main(String[] args) {

		ThreadEx th = new ThreadEx();
		th.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		// 메인이 3초 기다린다
		th.interrupt(); // interrupt 발생시킨다.
		System.out.println("메인종료");
	}
}

class ThreadEx extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// e.printStackTrace();
				System.out.println(" 자고 있는데 깨어남 ");
				return;
			}
			System.out.println((i + 1) + " hi ^^ ");

			if (isInterrupted()) {
				System.out.println(" 인터럽트 요청 받음 ");
				return;
			}
		}
	}
}