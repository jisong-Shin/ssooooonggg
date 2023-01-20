package step00_과제1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제10] 4개의 값을 콘솔에서 입력받아 처리하시오
        조건) 성별 : M 이면 "남자", 나머지 "여자" 
             (삼항연산자 이용)

Input name: 들국화
Input gender: F
Input age:  25
Input tall: 173.3 

--결과--
이름 : 들국화
성별 : 여자 
나이 : 25세
신장 : 173.3cm  
 */
public class Work10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		String gender;
		char code='M';
		int age;
		double tall;
		
		System.out.print("Input name : "); name=br.readLine();
		System.out.print("Input gender : "); gender=br.readLine();
		System.out.print("Input age : "); age=Integer.parseInt(br.readLine());
		System.out.print("Input tall : "); tall=Double.parseDouble(br.readLine());
		
		System.out.println("이름 : "+name); 
		System.out.println("성별 : "+gender); gender=((code=='M')?"남자":"여자"); 
		System.out.printf("나이 : "+age+"세\n");
		System.out.println("신장 : "+tall+"cm");
		

	}

}
