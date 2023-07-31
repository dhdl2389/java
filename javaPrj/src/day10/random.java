package day10;

import java.util.Arrays;
import java.util.Random;

public class random {

	public static void main(String[] args) {
		int n = 10; // 배열 크기
		int[] a = new int[n];
		Random r = new Random();

		// 배열 초기화
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}

		// 배열 요소를 섞음 (Fisher-Yates 셔플 알고리즘 사용)
		for (int i = n - 1; i > 0; i--) {
			int j = r.nextInt(i + 1);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		// 결과 출력
		System.out.println(Arrays.toString(a));
	}

}
