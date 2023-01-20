package step00_과제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*   풀지 못함.
 * [문제 20] for문을 이용해서 제곱승을 구하시오
x값을 입력하시오: 2
y값을 입력하시오: 3

2의 3승은 8입니다
 */
public class work20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		System.out.print("x값을 입력하시오 : "); 
		a=Integer.parseInt(br.readLine());
		System.out.print("y값을 입력하시오 : ");
		b=Integer.parseInt(br.readLine());
		
		for(int i=0; b<=1000; a*=b) 
			System.out.println(a+"의 "+b+"승은 "+i+"입니다");
		return;

	}

}
