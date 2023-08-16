package day20.thread;

public class 자동저장 {

	public static void main(String[] args) {

		AutoSave s = new AutoSave();
		s.setDaemon(true);
		s.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("메인에서 작업을 진행합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("메인 종료");
	}
}

///////////////////////////////////////
class AutoSave extends Thread {

	void autoSave() {
		System.out.println("작업파일 자동저장 되었습니다.");
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep(3000);
				autoSave();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
