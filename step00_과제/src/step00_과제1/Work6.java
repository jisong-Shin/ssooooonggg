package step00_과제1;
/*
[문제6] 다음을 변수에 대입하여 계산하시오
        (삼각형넓이 = (밑변 * 높이)/2)  

--변수--
base변수 :  10  
height높이 :   3
   

--출력--
넓이 :   XX.XX  <--- 소수 2자리까지출력하시오

 */
public class Work6 {

	public static void main(String[] args) {

		int base=10;
		int height=3;
		float A=(int)(base*height)/2.2f;
		
		System.out.printf("넓이 : %.2f", A);
		
	}

}
