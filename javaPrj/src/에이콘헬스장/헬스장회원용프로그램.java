package 에이콘헬스장;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 헬스장회원용프로그램 {

	public static void main(String[] args) {

		ArrayList<PersonInfo> list = new ArrayList<>();
		loadFile(list);
		Scanner sc = new Scanner(System.in);
		식단 f = new 식단();

		loop2: while (true) {
			System.out.println("이름과 코드를 입력해주세요");
			String name = sc.next();
			String code = sc.next();
			boolean isValue = false;
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).name) && code.equals(list.get(i).code)) {
					list.get(i).attendance_rate();
					System.out.println(list.get(i));
					isValue = true;
				}
			}
			if (isValue) {
				System.out.println("로그인성공");

				loop1: while (true) {

					System.out.println("\n" + "1.식단보기 2.일정확인 3.종료");
					int menu = sc.nextInt();

					switch (menu) {
					case 1:
						System.out.println("키(m)와 몸무게를 입력하세요");
						double height = sc.nextDouble();
						int weight = sc.nextInt();
						double bmi = weight / (height * height);

						if (bmi <= 18.5) {
							f.식단1();
						} else if (bmi <= 25) {
							f.식단2();
						} else if (bmi > 25) {
							f.식단3();
						}
						break;

					case 2:
						이번달일정 i = new 이번달일정();
						i.schedule();
						break;

					case 3:
						System.out.println("종료");
						saveFile(list);
						break loop1;

					default:
						System.out.println("잘못된 입력");
					}
				}
				break loop2;
			} else {
				System.out.println("이름과 코드를 다시 확인해주세요");
			}

		}

	}

	private static void saveFile(ArrayList<PersonInfo> list) {
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("헬스장.txt"));

			for (int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			}
			System.out.println("파일생성완료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void loadFile(ArrayList<PersonInfo> list) {
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("헬스장.txt"));
			try {
				while (true) {
					PersonInfo data = (PersonInfo) ois.readObject();
					list.add(data);
				}
			} catch (EOFException e) {
				System.out.println(" 다 읽었음");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
