package algoPrj.day3;

public class 김재열S_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double HP = 2500000;
		double HR = 0.036;

		double KP = 1800000;
		double KR = 0.042;

		int Y = 1999;

		while (true) {
			Y = Y + 1;
			HP = HP * (1 + HR);
			KP = KP * (1 + KR);
			if (KP > HP)
				break;
		}
		System.out.println(Y);

	}

}
