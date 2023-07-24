package 문법.day4;

public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 분기문 if, switch

		// if문 형식
		/*
		 * if(조건식) { }
		 */

		/*
		 * if(조건식){ }else{ }
		 */

		/*
		 * if(조건식){ else if(조건식){ } else if (조건식){ } }
		 */

		int score = 90;
		if (score >= 90) {
			System.out.println("학점은 A");
		} else if (score >= 80) {
			System.out.println("학점은 B");
		} else {
			System.out.println("LOSER");
		}
		///////////////////////////////////
		//if문 사용시 주의 사항  위의 코드와 아래코드는 다른 결과를 발생한다.
		if (score >= 90) {
			System.out.println("학점은  A");
		}
		
		if (score >= 80) {
			System.out.println("학점은  B");
		}
		///////////////////////////////////
		
		
	}

}
