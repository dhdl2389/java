package algoPrj.day2;

public class 표준태S_1 {

	public static void main(String[] args) {  //start
		// TODO Auto-generated method stub
       
		//변수선언
		double hp = 250;  //h시 인구
		double hu = 0.036; //h시 증가율
		double hup = 0; //h시 증가인구
		
		double kp = 180; //k시 인구
		double ku = 0.042; //k시 증가율
		double kup = 0; //k시 증가인구
		
		int y = 1999;//기준연도
		int c = 0;
		int sum;//출력변수 (k시가 h시 인구를 초과하는 년도)
		
		while(hp >= kp) {
			hup = hp*hu; // (250*0.036)
			hp = hp+hup;
			
			kup = kp*ku;
			kp = kp+kup;
			
			c = c+1;		
		}
		sum = y+c;
		System.out.println(sum);
		
	}

}
