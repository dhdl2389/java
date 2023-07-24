package algoPrj.day2;

public class 이정훈S_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a, b;  // a=1, b=1
		a=b=1;
		int n = 2;
		final int MAX = 50;
		
		System.out.println( a+ " " + b);
		
		while( n< MAX ) {
			b = b+a;
			a = b-a;
			n = n+1;
			System.out.println(b);
		}

	}

}
