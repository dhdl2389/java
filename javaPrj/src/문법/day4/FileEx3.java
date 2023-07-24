package 문법.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("res/data.txt");
		FileOutputStream fout = new FileOutputStream("res/dataCopy.txt");

		int x;

		while ((x = fin.read()) != -1) {  //파일의 끝이 아닌동안
			fout.write(x);
		}

	}

}
