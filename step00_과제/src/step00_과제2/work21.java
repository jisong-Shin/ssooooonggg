package step00_과제2;
/*   풀지 못함.
 * [문제 21] 아래 배열의 값 중 홀수방의 합과 짝수방의 합을 구하시오(단일 for문)
int[] num={1,5,2,7,3,9,10,4,6,8};

--출력--
홀수방의 합= 33
짝수방의 합= 22
 */
public class work21 {

	public static void main(String[] args) {
		int[] num={1,5,2,7,3,9,10,4,6,8};
		int total=0, evenTotal=0,oddTotal=0;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) {
				evenTotal=num[i];
			}else {
				oddTotal=num[i];
			
		}
			System.out.println("짝수방의 합 = "+evenTotal);
			System.out.println("홀수방의 합 = "+oddTotal);
			
				
			}
					
		}


	}


