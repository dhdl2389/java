package day20.thread;

import java.util.Random;
import java.util.Scanner;

class MoleGame {
	private int score = 0;
	private boolean isRunning = true;
	private Random random = new Random();

	public void showMole() {
		while (isRunning) {
			try {
				Thread.sleep(random.nextInt(2000) + 1000); // 1초에서 3초 사이의 랜덤한 시간 대기
				System.out.println("두더지 등장!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void startGame() {
		System.out.println("두더지 게임을 시작합니다!");

		Thread moleThread = new Thread(this::showMole);
		moleThread.start();

		Scanner scanner = new Scanner(System.in);
		while (isRunning) {
			System.out.print("두더지를 잡을 준비가 되었나요? (두더지가 나온 후 Enter 키를 누르세요)");
			scanner.nextLine();

			if (!isRunning) {
				break;
			}

			score++;
			System.out.println("두더지를 잡았습니다! 현재 점수: " + score + "\n");
		}

		moleThread.interrupt();
		System.out.println("두더지 게임을 종료합니다. 최종 점수: " + score);
	}

	public void stopGame() {
		isRunning = false;
	}

	public static void main(String[] args) {
		MoleGame game = new MoleGame();

		try {
			game.startGame();
		} catch (Exception e) {
			game.stopGame();
		}
	}
}