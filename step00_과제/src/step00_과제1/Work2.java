package step00_과제1;
/*
[문제2]65430원을 만들기 위한 화폐의 갯수를 구하시오.
money = 65430원
만원 = 6
천원 = 5
백원 = 4
십원 = 3
 */
public class Work2 {
	
	public static void main(String[] args) {
		int money=65430;
		int m1=(int)money/10000;
		int m2=(money%10000)/1000;
		int m3=(money%1000)/100;
		int m4=(money%100)/10;
		
		System.out.println("만원 = "+m1);
		System.out.println("천원 = "+m2);
		System.out.println("백원 = "+m3);
		System.out.println("십원 = "+m4);
		
		

	}

}
