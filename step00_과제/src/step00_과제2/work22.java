package step00_과제2;
/*  O
 * [문제 22] 아래 문자열 배열의 데이터의 길이를 구하시오(단일 for문)
String[] color={"red","green","blue","yellow","pink"};
힌트) color[0].length

--출력--
red는(은) 3글자 입니다
green는(은) 5글자 입니다
blue는(은) 4글자 입니다
yellow는(은) 6글자 입니다
pink는(은) 4글자 입니다

 */
public class work22 {

	public static void main(String[] args) {
		String[] color= {"red","green","blue","yellow","pink"};
		
		int a=color[0].length();
		int b=color[1].length();
		int c=color[2].length();
		int d=color[3].length();
		int e=color[4].length();
		
			
		for(int i=0; i<color.length;i++) {
			System.out.println(color[i]+"는(은) "+color[i].length()+"글자 입니다."); 
		}
				
	}

}
