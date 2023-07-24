package algoPrj.day3;

public class 김재열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int HP = 2500000;
		double HR = 0.036;

		int KP = 1800000;
		double KR = 0.042;

		int Y = 1999;

		while (KP < HP) {
			HP = (int) (HP * (1 + HR));
			System.out.println(HP);

			KP = (int) (KP * (1 + KR));
			System.out.println(KP);
			Y++;
		}
		System.out.println("K시의 인구가 H시의 인구보다 많은 연도는" + Y + "입니다.");
	}

}
