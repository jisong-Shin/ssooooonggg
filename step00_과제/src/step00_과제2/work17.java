package step00_과제2;
/*    O
 * [문제17]1~100사이의수 중에서  3의 배수이면서 7의 배수 구하기(단일 for문)
      조건) for문과 && 연산자를 반드시 이용

--출력--
  21 42 63 84   
 */
public class work17 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%3!=0 || i%7!=0) 
			continue;
				System.out.print(i+" ");
			}
			

	}

}
