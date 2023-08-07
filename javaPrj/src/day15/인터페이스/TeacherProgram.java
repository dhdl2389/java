package day15.인터페이스;

import java.util.Scanner;

public class TeacherProgram {
	MyRunnable r; // 사용안되면 참조형 변수 null

	public void setR(MyRunnable r) {
		this.r = r;
	}

	public void run() {
		r.run();
	}

	public static void main(String[] args) {
		System.out.println("학생들이 작성한 코드를 실행시켜드립니다");
		TeacherProgram p = new TeacherProgram();
		Kjy kjy = new Kjy();
		p.setR(new MyRunnable() {
			@Override
			public void run() {
				System.out.println("태민코드 실행합니다");
			}
		});
		p.run();

		kjy.run();

		/*
		 * p.setR(new Kjy()); p.run();
		 */
		
	}

}
