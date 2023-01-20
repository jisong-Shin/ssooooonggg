package step00_과제1;
/*
 [문제5] 다음을 각각 변수에 대입해서 계산하시오

--변수--
name변수 : 민들래
kor변수 : 90 
eng변수 : 70 
mat변수 : 75

--출력--
이름 : 민들래
합계점수 : 235점
평균점수 :  78.3   <-- 소수 1자리까지출력하시오
 */
public class Work5 {

	public static void main(String[] args) {
		String name="민들레";
		int kor=90; 
		int eng=70; 
		int mat=75;
		int tot=(kor+eng+mat);
		float avg=(int)tot/3.1f;
		
		System.out.println("이름 : "+name); 
		System.out.println("합계점수 : "+tot+"점");
		System.out.printf("평균점수 : %.1f", avg);
		

	}

}
