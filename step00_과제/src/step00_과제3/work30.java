package step00_과제3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*O
 * [문제30] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
원하는 month을 입력받아 그 달의 날수를 출력하시오

(1) main()에서 배열선언후 코드를 완성하시오
      int []month={31,28,31,30,31,30,31,31,30,31,30,31};
 (2)콘솔에서 달(month)을 입력받아 해당하는 일(day)를 출력하시오

[실행결과]
원하는 month을 입력하시오 : 3
3월은 31일입니다.
 */
public class work30 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int [] month={31,28,31,30,31,30,31,31,30,31,30,31};
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 month을 입력하시오 : ");
		int m=Integer.parseInt(br.readLine());
		
		int i=0;
		System.out.println(m+"월은 "+month[i]+"일 입니다.");
		month[i]=Integer.parseInt(br.readLine());
	}

}
