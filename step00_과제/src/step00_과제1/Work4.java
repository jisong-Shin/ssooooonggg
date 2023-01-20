package step00_과제1;
/*
 [문제4] 각각변수에 대입하여 출력하시오
   조건1) data는 이효리, 개발부, 대리, 1500000로 대입
          변수명은 각각  name,department,position,sal로 할것
   조건2)출력은 아래와 같은 메서드(함수)를 이용하시오

--출력--
이름 : 이효리     ---> println
부서 : 개발부     ---> printf  
직위 : 대리       ---> print 1번만써서 직위,급여출력
급여 : 1500000원
 */
public class Work4 {

	public static void main(String[] args) {
		
		String name="이효리";
		String dept="개발부";
		String pos="대리";
		int sal=1500000;
			
		System.out.println("이름 : "+name);
		System.out.printf("부서 : %s\n", dept);
		System.out.print("직위 : "+pos+"\n"+"급여 : "+sal+"원");

	}

}
