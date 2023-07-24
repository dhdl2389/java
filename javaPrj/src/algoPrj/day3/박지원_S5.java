package algoPrj.day3;

public class 박지원_S5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 등비수열 각항에 +3씩 규칙 적용됨
		// 공비 :3
		// 1 2 3 4 5 6 7 ...
		// 2 6 18 54 162 486 ...

		int sum = 0; // 항의 누적을 구할 변수
		int n = 0; // 반복제어 변수, 항의 순번
		int a = 2; // 항을 구할 변수
		int b = 3; // 공비

		while (n < 7) {
			sum = sum + a; // sum+=a;
			a = a * b;
			n++; // n=n+1
		}
		System.out.println(sum);

	}

}
