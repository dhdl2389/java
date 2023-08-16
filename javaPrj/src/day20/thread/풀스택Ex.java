package day20.thread;

public class 풀스택Ex {

	// 풀스택이란? 매서드 수행에 필요한 메모리가 제공되는 공간
	// 스택 : 들어온것이 나중에 꺼내지는 자료구조 (선입후출)
	// 매서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제됨

	void 매서드1() { // 2번
		매서드2();
		System.out.println("매서드1 call");
	}

	private void 매서드2() { // 1번
		System.out.println("매서드2 call");
	}

	public static void main(String[] args) { // 3번
		풀스택Ex p = new 풀스택Ex();
		p.매서드1();
		System.out.println("main call");
	}

}
