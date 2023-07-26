package day6;

import java.util.Arrays;

public class salkfdjsafs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};

        // Java 8 이상에서는 스트림 API를 사용하여 배열의 요소를 콤마로 구분하여 출력할 수 있습니다.
        String result = Arrays.stream(numbers)
                             .mapToObj(String::valueOf)
                             .reduce((s1, s2) -> s1 + ", " + s2)
                             .orElse("");
        
        System.out.println(result);
	}

}
