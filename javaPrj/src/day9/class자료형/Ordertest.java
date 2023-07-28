package day9.class자료형;

public class Ordertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order or = new Order();

		or.ordernum = 201803120001L;
		or.id = "abc123";
		or.date = "2018년3월12일";
		or.name = "홍길순";
		or.itemnum = "😛D0345-12";
		or.address = "서울시 영등포구 여의도동 20번지";

		System.out.println("주문번호: " + or.ordernum + " " + "주문자아이디: " + or.id + " " + "주문날짜: " + or.date + " "
				+ "주문자이름: " + or.name + " " + " 상품번호: " + or.itemnum + " " + " 배송주소: " + or.address + " ");

	}

}
