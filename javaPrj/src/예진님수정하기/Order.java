package 예진님수정하기;

public class Order {

	
	int count;
	Goods goods;
	int total;
	
	
	public Order(int count,Goods goods) {
		super();
		this.count = count;
		this.goods = goods; 
		this.total = goods.pdprice*this.count;
		
		
	}
	

	@Override
	public String toString() {
		return "Order [상품번호" + goods.num + ", 상품명=" + goods.name + ", 수량=" +count + " 가격 "+goods.pdprice+" 총금액=" +total+"]";
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	public Goods getGoods() {
		return goods;
	}



	public void setGoods(Goods goods) {
		this.goods = goods;
	}



	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
