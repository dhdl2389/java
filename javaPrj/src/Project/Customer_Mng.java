package Project;


import java.util.ArrayList;

import java.util.Scanner;

public class Customer_Mng {
	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> clist = new ArrayList<>();
	public Customer_Mng() {}
	public void init(Membership_Mng mm) { // 고객 정보 초기화
		clist.add(new Customer("홍길동","경기도 양평군 양평읍", "010-4032-2222",32,2310,mm.FindMembership(32)));
		clist.add(new Customer("고길동","경기도 시흥시 정왕동", "010-4444-3333",7,84,mm.FindMembership(7)));
		clist.add(new Customer("김학생","서울특별시 마포구", "010-4568-4698",77,5560,mm.FindMembership(77)));
		clist.add(new Customer("이학생","서울특별시 동대문구 ", "010-2248-5635",105,35810,mm.FindMembership(105)));
		clist.add(new Customer("김학생","서울특별시 동대문구 ", "010-2248-5635",105,35810,mm.FindMembership(105)));
		clist.add(new Customer("박학생","서울특별시 동대문구 ", "010-2248-5635",105,35810,mm.FindMembership(105)));
		
	}
	public void printData() { // 고객 정보 조회(등급 정보까지 조회 가능)
		for(int i=0; i<clist.size(); i++) {
			Customer customer = clist.get(i);
			System.out.println(customer);
		}
	}
	public void inputData(Membership_Mng mm) { // 회원가입 기능
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		System.out.print("휴대폰 번호를 입력하세요 : ");
		String phone = sc.nextLine();
		int totalCost= 0;
		int totalPoint = 0;
		clist.add(new Customer(name, address, phone, totalCost, totalPoint,mm.FindMembership(totalCost)));
		System.out.println("회원 정보가 등록되었습니다. ");
	}
    public void login() { // 로그인 (좀 더  수정해야 할 듯??)
    	System.out.print("아이디를 입력하세요 : ");
    	int pwNum = 0;
    	String name = sc.nextLine();
    	for(int i=0; i<clist.size(); i++) {
    		if(clist.get(i).getName().equals(name)) {
    			System.out.print("비밀번호를 입력하세요");
    			String pw = sc.nextLine();
    			if(clist.get(i).getPhone().equals(pw)) {
    				System.out.println("로그인 완료");
    			}
    			else {
    				System.out.println("비밀번호를 잘못입력했습니다. ");
    			}
    		}
    	}
    }

    public void showMember(Membership_Mng mm) {
    	System.out.println("1. GOLD OLIVE");
    	System.out.println("2. BLACK OLIVE");
    	System.out.println("3. GREEN OLIVE");
    	System.out.println("4. PINK OLIVE");
    	System.out.println("5. BABY OLIVE");
    	int num = sc.nextInt();
        for(int i=0; i<clist.size(); i++) {
        	if(clist.get(i).getMmsh().equals(mm.mlist.get(num-1))) {
        		System.out.println(clist.get(i));
        	}
        }
    }
    
    
    
    /*
    public void showMember(Membership_Mng mm) {
    	System.out.println("1. GOLD OLIVE");
    	System.out.println("2. BLACK OLIVE");
    	System.out.println("3. GREEN OLIVE");
    	System.out.println("4. PINK OLIVE");
    	System.out.println("5. BABY OLIVE");
    	int num=0;
    	switch(1) {
    	case 1:
    		if()
    	}
    }*/
    
}


