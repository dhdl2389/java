package day12.다형성예제_Object;

public class 하와이안피자 extends Pizza {
	
	public void 파인애플() {
		System.out.println("파인애플");
	}

	@Override
	public void 양파() {
		System.out.println("양파제외");
	}

	@Override
	public void 올리브() {
		System.out.println("올리브 제외");
	}

	@Override
	public void 페퍼로니() {
		System.out.println("페퍼로니");
	}

	@Override
	public void 소스() {
		System.out.println("토마토소스");
	}

	@Override
	public void 소시지() {
		System.out.println("소시지제외");
	}

}
