package step00_과제3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*O
 * [문제29] 다음 프로그램을 작성하시오   
(1) BufferedReader를 이용하여 콘솔에서 입력받는다
(2) 이름, 나이....등 각각 배열을 3개씩 만들어서 입력 받는다
      String[] name=new String[3];
      int[] age=new int[3];


[실행결과]
이름을 입력하시오 : 홍길동     <---name[0]방에 입력받는다
나이를 입력하시오 : 20          <---age[0]방에 입력받는다

이름을 입력하시오 : 민들래
나이를 입력하시오 : 21

이름을 입력하시오 : 개나리
나이를 입력하시오 : 52

홍길동     20세
민들래   21세
개나리   52세
 */
public class work29 {

	public static void main(String[] args) throws IOException {
		 String[] name=new String[3];
	     int[] age=new int[3];

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<=2; i++) {
		System.out.print("이름을 입력하시오 : ");
		name[i]=br.readLine();
	
		System.out.print("나이를 입력하시오 : ");
		age[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(" ");
		
		System.out.println(name[0]+"\t"+age[0]+"세"
				+"\n"+name[1]+"\t"+age[1]+"세"
				+"\n"+name[2]+"\t"+age[2]+"세");
}}
