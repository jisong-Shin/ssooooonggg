package db4;

import java.util.Scanner;

public class EmpMain {
		Scanner sc=null;
		EmpBiz biz=null;
	public EmpMain() {
			sc=new Scanner(System.in);
			biz=new EmpBiz();
		}	
		public void menu() {
		int n=0;
		String name=null, phone=null, addr=null;
		
		while(true) {
			System.out.print("1.전체  2.추가  3.수정  4.삭제  5.검색  6.종료\n"
								+ "선택하세요(1-6) : ");
			n=sc.nextInt();
			
			switch(n) {
			case 1: 
				biz.addressList();
				break;
						
			case 6:
				sc.close();
				System.out.println("******* 종료합니다 *********");
				System.exit(0);
				
			}
		}
	}
	public static void main(String[] args) {
		new EmpMain().menu();
		
}}
