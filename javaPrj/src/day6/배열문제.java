package day6;

import java.util.Scanner;

public class 배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temperatures = { 27, 27, 28, 29, 30, 33, 32, 33, 32, 31, 31, 33, 33, 31 };

		for (int i = 0; i < temperatures.length; i++) {
			System.out.print(temperatures[i] + " ");
		}

		System.out.println();

		for (int i = temperatures.length - 1; i >= 0; i--) {
			System.out.print(temperatures[i] + " ");
		}

		System.out.println();

		double avg = 0;
		int sum = 0;
		for (int i = 0; i < temperatures.length; i++) {
			sum += temperatures[i];

		}
		avg = sum / temperatures.length;
		System.out.println("평균기은은"+avg);

		int count = 0;
		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] > avg) {
				count++;
			}
		}
		System.out.println("평균기온보다 높은 일수는"+count);

		int max = 0;
		for (int i = 0; i < temperatures.length; i++) {
			if (max < temperatures[i]) {
				max = temperatures[i];
			}
		}
		System.out.println("최대는"+max);

		int min = 100;
		for (int i = 0; i < temperatures.length; i++) {
			if (min > temperatures[i]) {
				min = temperatures[i];
			}
		}
		System.out.println("최소는"+min);

		  Scanner sc = new Scanner(System.in);
	        int[] num = new int[20];

	        int count1 = 0;
	        System.out.println("수를 입력하세요");

	        int a = sc.nextInt();

	        for (int i = 1; i <= a; i++) {
	            if (a % i == 0) {
	                num[count1++] = i;
	            }
	        }
	        
	       System.out.println("약수는");
	        for (int i = 0; i < count1; i++) {
	            System.out.print(num[i] + " ");
	        }
	        System.out.println();
	        System.out.println("약수의 개수는"+" "+count1+"입니다.");
	

	}

}
