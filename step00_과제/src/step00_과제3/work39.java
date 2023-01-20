package step00_과제3;
/*
 * [문제 39]다음과 같은 결과가 나오도록 수정하시오
        (단, main()안의 내용수정과 새로운 Method추가하지마시오)

[결과화면]
**** x,y,z에 값채우기***
10을 넘겨받은 생성자
10   20   을 넘겨받은 생성자
10   20   30  을 넘겨받은 생성자
10   20   30
합 : 60
------------------------------------
class SuperEx
{
	int x,y,z;
	
	public SuperEx(){
		System.out.println("**** x,y,z에 값채우기***");
	}
	public SuperEx(int k){
		System.out.println(k + "을 넘겨받은 생성자");
	}
	public SuperEx(int a, int b){
		System.out.println(a + "   " +b+"   을 넘겨받은 생성자");
	}
	public SuperEx(int x,int y,int z){
                            System.out.println(x+ "   " +y+"   " +z+"   을 넘겨받은 생성자");
	}
	public void display(){
		System.out.println(this.x+"   "+this.y+"   "+this.z);
	}
}
class SubEx extends SuperEx
{
	public SubEx(int a,int b,int c){
	    //코드를 추가하시오	
		
	    super.display();
	    this.sumData();
	}	
	public void sumData(){
		System.out.println("합 : " + (x+y+z));
	}
}
public class Test39 {
	public static void main(String[] args) {
		 new SubEx(10,20,30);
	}
}
  
 */
public class work39 {

	public static void main(String[] args) {

	}

}
