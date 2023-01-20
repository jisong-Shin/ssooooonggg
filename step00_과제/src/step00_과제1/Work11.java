package step00_과제1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/*
[문제11]2개의 숫자와 연산자를 입력하여 계산하시오
        조건1) 실수인경우는 소수이하 2째자리까지 출력하시오
        조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 
               "연산자error"출력하시오

[실행결과]
$ java  Test11   25  36    <-- args입력
연산자를 입력(+,-,*,/) : +  <-- 콘솔입력(BufferedReader를 이용)
25 + 36 = 71

$ java  Test11   25  36
연산자를 입력(+,-,*,/) : /
25 / 36 = xx.xxxxx      

java  SwitchExam   25  36
연산자를 입력(+,-,*,/) : #
연산자 error
 */
public class Work11 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[2]);
		char c;
		
		
		switch(c=='+')
		System.out.println("연산자를 입력(+,-,*,/) : "); 
		System.out.println(a+" + "+b+" = "+(a+b+10));
		
		System.out.println("연산자를 입력(+,-,*,/) : ");
		System.out.printf(a+" / "+b+" = "+(a/b));
		
	}

}
