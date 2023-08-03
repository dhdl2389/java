package 김재열실기평가;

import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		int ranNum = ran.nextInt();
		if (ranNum < 0 ) {
			ranNum*= -1;
		}
		
		
		System.out.println(ranNum);
	}

}
