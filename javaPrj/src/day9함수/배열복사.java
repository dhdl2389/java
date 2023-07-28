package day9함수;

import java.util.Arrays;

public class 배열복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 3, 5, 9 };
		// int[] arr={3,5,9}

		// 배열복사
		int[] newArray = new int[3];

		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArray));
	}

}
