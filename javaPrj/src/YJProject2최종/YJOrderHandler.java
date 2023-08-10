package YJProject2최종;

import java.util.ArrayList;

public class YJOrderHandler {

	ArrayList<YJOrder> Olist = new ArrayList<>();

	// 주문정보 등록
	public void addOrderItem(YJOrder order) {

		Olist.add(order);
	}

//	주문정보 조회
	public void showOrders() {

		for (YJOrder o : Olist) {
			System.out.println(o);
		}
	}

//	주문삭제
	public void removeOrders(int num) {

//		System.out.println(num+"번째 상품을 삭제하겠습니다.");
		// Olist.remove(num-1);
		/*
		 * for( Order o : Olist) { // 상품번호6인것을 찾은다음 삭제 if( o.getGoods().getNum()== num)
		 * { Olist.remove(o); } }
		 */

		for (int i = 0; i < Olist.size(); i++) {
			YJOrder o = Olist.get(i);
			if (o.getGoods().getNum() == num) {
				Olist.remove(o);
			}
		}

	}

}
