package step00_과제3;
/*
 * [문제 24]다중for문을 이용해서 모양을 만드시오
*****
****
***
**
*

1
21
321
4321
54321
 */
public class work24 {

	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
			for(int j=1; j>i; j--) {
				System.out.print("*");}}
				System.out.println("\n");
				
			for(int i1=1; i1<6; i1++) {
			for(int j1=0; j1<i1; j1++) {
				System.out.print(i1-j1);
			} System.out.println(" ");}}
		}

