package day14.ExceptionEx;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예외처리 : 예외발생시 대비코드를 작성하는 것

		// 필수 : checked : 반드시 해야하는 것 !!
		// 선택 : unchecked // 배열의 범위 벗어 났을 때, 0으로 나누는 것, "25 안" ->)
		// => 방법1개 try{} catch()이용
		try {

			// 예외가 발생하면 예외객체가 생성됨
			int[] arr = new int[3];
			arr[3] = 50;
			System.out.println(arr[3]);
		} catch (Exception e) {
			// } catch (ArrayIndexOutOfBoundsException e) {
			// 예외가 발생 되었을 때 해야할 일( 코드 )
		}
		System.out.println("정상종료");
	}

}
