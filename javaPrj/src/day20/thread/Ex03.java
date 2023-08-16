package day20.thread;

public class Ex03 {

	public static void main(String[] args) {

		Thread1 th1 = new Thread1();
		th1.start(); // 주의 !! start() 호출해야 함

		Thread2 th2 = new Thread2();
		th2.start();

	}

}

// 수행할 코드를 작성하는 것!!
// void run()
class Thread1 extends Thread {

	@Override
	public void run() {
		// 별도의 스레드로 작성
		for (int i = 0; i < 100; i++) {
			System.out.println((i + 1) + "hi ^^");
		}
	}

}

class Thread2 extends Thread {

	@Override
	public void run() {
		// 별도의 스레드로 작성
		for (int i = 0; i < 100; i++) {
			System.out.println((i + 1) + "bye ^^");
		}
	}

}
