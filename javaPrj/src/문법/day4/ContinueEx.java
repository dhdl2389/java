package 문법.day4;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue 명령 반복문에서 다음 반복으로 바로 진행될 수 있도록 하는 명령
		// 1~10까지 홀수합구하기
		// 1 3 5 7 9

		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) { // i가 짝수이면
				continue;
			}
			sum += i;
		}
		//1        0
		//i  i%2  sum
		//1   1    1
		//2   0    1
		//3   1    4
		//4   0    4
		//5   1    9
		//6   0    9
		//7   1    16
		//8   0    16
		//9   1    25
		
		System.out.println(sum);

	}

}
