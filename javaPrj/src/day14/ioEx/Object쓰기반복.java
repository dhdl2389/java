package day14.ioEx;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Object쓰기반복 {

	public static void main(String[] args) {

		ArrayList<Score> list = new ArrayList<>();

		

		// 파일저장
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("res/scoreList.txt"));

			for (int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			}

			oos.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 파일읽어오기

	}

}
