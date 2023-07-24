package algoPrj.day2;

public class 이정훈S_333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		a=b=1;
		int n=2;
		final int MAX = 10;
		
		System.out.println( a + " " + b);
		
		while( true ) {
			a = a+b;
			n = n+1;
			System.out.println( a );
			if( n > MAX ) break;		
			b = a+b;
			n = n+1;
			System.out.println( b );
			if( n > MAX ) break;
			
			}		

	}

}
