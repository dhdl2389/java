package 에이콘헬스장;

public class 헬스장가계부 {
	int n1,n2,n3;
	
	public 헬스장가계부(){
	}
	
	public int 회원수입(int a) {
		int b =(a+40)*10;
		n1=b;
		System.out.println("회원수입: " + b + "만원");
		return n1;
	}
	
	public int PT수입(int a) {
		int b =a*5;
		n2=b;
		System.out.println("PT수입: " +b + "만원");
		return n2;
	}
	
	public int 고정지출() {
		int a =150;
		int b= 400;
		n3=a+b;
		System.out.println("고정지출 =>" + " 월세:" + a + "만원" + " 직원월급: " + b + "만원");
		return n3;
	}
	
	public void 순수익() {
		int c= n1+n2-n3;
		if(c<0) {
			System.out.println("순수익: " +c + "만원");
			System.out.println("이번달은 적자");
		}else if(c>200) {
			System.out.println("순수익: " +c + "만원");
			System.out.println("이번달은 회식");
		}else {
			System.out.println("순수익: " +c + "만원");
			System.out.println("이번달은 흑자");
		}
	}
}
