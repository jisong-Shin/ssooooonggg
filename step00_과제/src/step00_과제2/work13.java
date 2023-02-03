package step00_과제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2023-01-03(화)
/*  O
﻿[문제13]연도를 입력받아 윤년/평년 구하기
(공식) ① 연도를 4로 나누어 떨어져야 하고
        연도를 100으로 나누어 떨어지지 않아야함
      ② 또는 연도를 400으로 나누어 떨어져야 함
        (참고) 4(윤년), 100(평년), 400(윤년)임 

--출력--
연도 입력 : 2000
윤년

연도 입력 : 2001
평년

연도 입력 : 2004
윤년
 */

public class work13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		System.out.print("연도 입력 : "); a=Integer.parseInt(br.readLine());  
		
		if(a%4==0 || a%400==0) {
			System.out.println("윤년");
		}else if(a%100!=0) { 
			System.out.println("평년");
		}
		}
		
	}

