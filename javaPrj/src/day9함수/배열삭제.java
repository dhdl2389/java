package day9함수;

public class 배열삭제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int[] arr = new int[] { 5, 2, 8, 9 };
		// 삭제할 index : 2( 8을 삭제 )

		int index = 2;
		int[] newArr = new int[arr.length - 1];

		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}

		for (int i = index + 1; i < arr.length; i++) {
			newArr[i - 1] = arr[i];
		}

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}

	}

}
