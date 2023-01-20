package step00_과제1;
/*
 [문제3] 급여명세서를 작성하시오
 조건1) 기본급이 1,500,000원,시간수당이 55,000원,세금은 기본급의 10%
 조건2) 실수령액 = 기본급 + 시간수당 - 세금

--출력--     
실수령액 : 1405000원
 */

public class Work3 {

	public static void main(String[] args) {
		
		int a=1500000; 
		int b=55000;
		double tax=a*0.1;
		int A=(int)(a+b-tax);
		
		System.out.println("실수령액 : "+A+"원");
		
		
		
		
		

	}

}
