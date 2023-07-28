package day9함수;

public class 배열삭제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };

		int index = 2;
		int[] newArray = new int[arr.length-1];

		for (int i = 0; i < index; i++) {
			newArray[i] = arr[i];
		}
		
		for(int i=index+1; i< arr.length; i++) {
			newArray[i-1] = arr[i];
		}
		
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		}
	}

}
