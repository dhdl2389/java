package day14.ExceptionEx;

import java.util.ArrayList;

public class VehicleTest {

	ArrayList<String> list;

	public static void main(String[] args) {
		new VehicleTest().run();
		// 차랑등록하기
	}

	public void run() {
		// 하이패스차량등록하기
		regHiPass();
		try {
			doHiPass("소나타");
			doHiPass("벤츠");
		} catch (VehicleNoRegException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public VehicleTest() {
		list = new ArrayList<>();
	}

	private void regHiPass() {
		list.add("SM7");
		list.add("소나타");
	}

	private void doHiPass(String carName) throws VehicleNoRegException {
		boolean flag = false;
		for (String car : list) {
			if (carName.equals(car)) {
				System.out.println("하이패스 pass ok");
				flag = true;
			}
		}
		if (flag == false)
			throw new VehicleNoRegException();
	}
}
