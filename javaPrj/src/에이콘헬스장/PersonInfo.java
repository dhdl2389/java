package 에이콘헬스장;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class PersonInfo  implements Comparable<PersonInfo>, Serializable  {

	transient
	Scanner sc =new Scanner(System.in);
	transient
	Calendar cal =  Calendar.getInstance();
	transient
	SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");
	String name;
	String code;
	String startDate;
	String endDate;
	int pt,a,b,attendance=0,box;
	
	//생성자
	public PersonInfo(String name, String code, int pt) {
		super();
		this.name = name;
		this.code = code;
		this.pt = pt;		 
		StartDate();
		EndDate();
		locker();
	}
	
	public void StartDate() {
		System.out.println("시작날짜를 입력하세요");
		int yyyy=sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		cal.set(yyyy, mm-1, dd);		
		this.startDate = sf.format(cal.getTime()); 
		
	}
	
	public void StartDateInfo() {
		//cal.add(Calendar.MONTH ,-a);		
		System.out.println("시작날짜: "+startDate);	
	}
	
	public void setPt(int pt) {
		this.pt = pt;
	}

	public void EndDate() {
		System.out.print("추가할 개월 수를 쓰세요");	
		a=sc.nextInt();
		cal.add(Calendar.MONTH ,a);
		this.endDate = sf.format(cal.getTime());
		 	
	}
	public void AddDate() {
		System.out.print("추가할 개월 수를 쓰세요");	
		b=sc.nextInt();
		cal.add(Calendar.MONTH ,b);
		this.endDate = sf.format(cal.getTime());
	}
	public void EndDateInfo() {
		System.out.print("끝나는날짜: "+endDate);
		System.out.println();
	}
	public void attendance_rate() {
		attendance++;
	}
	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public int getPt() {
		return pt;
	}
	
	public void locker() {
		Random rd = new Random();
		int box = rd.nextInt(200)+1;
		this.box=box;
	}
	@Override
	public String toString() {
		return "\n이름: " + name + ", code: " + code + ", pt남은횟수: " + pt + ", 이번달 나온횟수: " +attendance + ", 사물함번호: " +box ;
	}

	@Override
	public int compareTo(PersonInfo o) {
		return  this.code.compareTo(o.code);
	}


	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
