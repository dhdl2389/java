package 에이콘헬스장;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;
import java.io.EOFException;
import java.io.FileInputStream;

public class 헬스장관리프로그램 {
	
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<PersonInfo> list = new ArrayList<>();
		int pt = 0,b=0;
		loadFile(list);
		loop1:while(true) {
			System.out.println("\n"+"1번:회원등록 2번:회원조회 3번:회원변경 4번:회원삭제 5번:종료");
			int menu=sc.nextInt();
			switch(menu) {
				case 1:
					System.out.println("이름 코드 pt남은횟수");
					String name = sc.next();
					String code = sc.next();
					pt = sc.nextInt();
					list.add(new PersonInfo(name,code,pt));
					b +=pt;
					break;
				case 2:
					Collections.sort(list);
					for( int i=0; i<list.size(); i++) {
						System.out.println(list.get(i));
						((PersonInfo) list.get(i)).StartDateInfo();
						((PersonInfo) list.get(i)).EndDateInfo();
					}
					break;
				case 3:
					Collections.sort(list);
					System.out.println("몇번째 회원의 정보를 변경하시겠습니까?");
					int num = sc.nextInt();
					System.out.println("※ 바꿀정보를 선택해주세요"+"\n"+ "1.끝나는 날짜  2.pt횟수");
					int num2 = sc.nextInt();
					if(num2 == 1) {
						((PersonInfo) list.get(num-1)).AddDate();
					}else if(num2 == 2) {
						System.out.println("추가할 pt횟수를 쓰세요");
						int newPt = sc.nextInt();
						b +=newPt;
						int newpt2= newPt + ((PersonInfo) list.get(num-1)).pt;
						((PersonInfo) list.get(num-1)).setPt(newpt2);;
					}
					break;
				case 4:
					Collections.sort(list);
					System.out.println("몇번째 회원정보를 삭제하시겠습니까?");
					int del = sc.nextInt();
					list.remove(del-1);
					break;
				case 5:
					System.out.println("종료");
					saveFile( list); 
					break loop1;
				default:
					System.out.println("잘못된 입력");
			}		
		}		
		헬스장가계부 a = new 헬스장가계부();
		a.회원수입(list.size());
		a.PT수입(b);
		a.고정지출();
		a.순수익(); 
		
	}
	
	
	
	private  static  void saveFile(ArrayList<PersonInfo> list) {
		ObjectOutputStream oos=null;
		
		try {
			oos  = new ObjectOutputStream(new FileOutputStream("헬스장.txt"));
			
			for( int i =0 ; i< list.size(); i++) {
				oos.writeObject(list.get(i));
			}
			System.out.println("파일생성완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if( oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	public  static  void loadFile(ArrayList<PersonInfo> list) {
		 ObjectInputStream ois=null;
		 
		 try {
			ois = new ObjectInputStream(new FileInputStream("헬스장.txt"));			
			try {
				while(true) {
						PersonInfo data =(PersonInfo) ois.readObject();
						list.add(data);
				}
			}catch(EOFException e) {
		    	  System.out.println(" 다 읽었음");
		      }	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
