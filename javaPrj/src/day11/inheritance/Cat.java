package day11.inheritance;

// 상속받을 때 사용하는 키워드 extends(확장한다)
//
public class Cat extends Animal {

	public void 쥐를잡는다() {
		System.out.println(" 쥐를 잡는다 ");
	}

	// 오버라이딩 : 부모의 매서드를 재정의하는것
	@Override
	public void 짖는다() {
		// TODO Auto-generated method stub
		System.out.println("애용");
	}
    @Override
    public void 잔다() {
    	System.out.println("눈을 뜬채 잔다");
    }
}
