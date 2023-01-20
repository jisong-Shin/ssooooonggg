package step00_과제1;

import java.text.ParseException;
import java.text.ParsePosition;

/*
 * String a = "100";
 *String b = "200";
 * a 와  b의 값을 형변환해서 두수의 곱을 구하시오

--출력--
100 * 200 = 20000 
 */
public class Work1 {

	public static void main(String[] args) {
		String a = "100";
		String b = "200";
		
		int a1=Integer.parseInt(a);
		int b1=Integer.parseInt(b);
				
		System.out.println(a1+" * "+b1+" = "+a1*b1);
		
		
	}

}
