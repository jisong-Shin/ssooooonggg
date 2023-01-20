package step00_과제1;
/*
 [문제12]성적처리프로그램
        중간고사,기말고사,레포트,출석점수를 Argument로 입력받아서 계산하시오

조건1) (중간+기말)/2       ---> 60%
          과제                   ---> 20%
          출석                   ---> 20%
     
조건2)   90이상 'A'학점     (3)A,B학점  ---->"excellent"
           80이상 'B'학점         C,D학점  ---->"good"
           70이상 'C'학점         F학점    ---->"poor"
           60이상 'D'학점        (switch문이용) 
           나머지 'F'학점
           (if~else if문이용)

$ java Test12  90 89 99 100  

[출력화면]
중간고사 : 90
기말고사 : 89
과제점수 : 99
출석점수: 100

성적=93.20      <---소수이하 둘째자리까지
학점=A              System.out.printf("성적 : %.2f", avg);
평가=excellent
 */
public class Work12 {

	public static void main(String[] args) {

	}

}
