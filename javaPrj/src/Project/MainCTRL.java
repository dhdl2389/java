package Project;
import java.util.Scanner;
public class MainCTRL {

	public static void main(String[] args) {

		Membership_Mng mm = new Membership_Mng();
		mm.init();
	
		Customer_Mng cm = new Customer_Mng();
		cm.init(mm);
		
		Admin adm = new Admin();
	
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 고객");
			System.out.println("2. 관리자");
			int num = sc.nextInt();
			loop: switch(num) {
			case 1:
				 while(true){
					System.out.println("1. 로그인");
					System.out.println("2. 회원가입");
					System.out.println("3. 상품 조회");
					System.out.println("4. 장바구니");
					System.out.println("5. 구매");
					System.out.println("6. 구매 내역");
					System.out.println("0. 뒤로가기");
					int cnum = sc.nextInt();
					switch(cnum) {
					case 1: 
						cm.login();
						break;
					case 2:
						cm.inputData(mm); 
						break;
					case 3:
						adm.printProduct();
						break;
					case 4:
						System.out.println("장바구니");
						break;
					case 5:
						System.out.println("구매");
						break;
					case 6:
						System.out.println("구매 내역");
						break;
					case 0:
						break loop;
					default:
						System.out.println("잘못된 입력입니다. ");
					}
			
				}
			case 2:
				while(true){
					System.out.println("1. 고객 조회");
					System.out.println("2. 등급별 고객 조회");
					System.out.println("3. 상품 조회 및 관리");
					System.out.println("0. 뒤로가기");
					int cnum = sc.nextInt();
					switch(cnum) {
					case 1: 
						cm.printData();
						break;
					case 2:
						cm.showMember(mm);
						break;
					case 3:
						adm.admin_menu();
						break;
					case 0:
						break loop;
					default:
						System.out.println("잘못된 입력입니다. ");
					}
				}
			}
		}
	}

}
