package day20.thread;

public class SleepEx {

	public static void main(String[] args) {

		SThread1 th1 = new SThread1();
		th1.start();

		SThread2 th2 = new SThread2();
		th2.start();

	}

}

//////////////////////////////////////////////////////

class SThread1 extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((i + 1) + "hi ^^");
		}
	}
}

class SThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((i + 1) + "bye ^^");
		}

	}
}
