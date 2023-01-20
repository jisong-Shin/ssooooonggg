package step00_과제3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/*
 * [문제28] 다음 프로그램을 작성하시오
(1)Argument를 통해 숫자를 입력받은후 입력숫자만큼 정수형배열을 만든다
(2)콘솔에서 각각 배열에 데이타를 입력 받는다
(3)입력받은 데이타의 평균을  구한다 

[실행결과]
$ java Test22  5

score[0]를 입력하시오 : 34.5
score[1]를 입력하시오  : 90.4
     .
     .
score[4]를 입력하시오  : 100.0

평균 : 56.45               <--- 소수점 아래 둘째자리까지 구하시오
 */
public class work28 {

	public static void main(String[] args)throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int [] a=new int[5];
		for(int i=0; i<a.length; i++); {	
//		System.out.println("score["+i+"]를 입력하시오 : ");
//		a[i]=Integer.parseInt(br.readLine());
//		}
		
		for(int i=0;i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
