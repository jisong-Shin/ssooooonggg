package step00_과제4;
/*
 * [문제 43] 오버라이드(override)를 이용하여 다음 프로그램을 작성하시오
(1)클래스명: Circle
   #r:int        
   #size :double        ==> 계산된 결괏값을 저장하는 변수
   #PI:double            ==> 초기값 3.141592, final
   +Circle(r:int)         ==> 반지름 대입
   +compute():void       
   +output():void 

(2)클래스명 :  CircleArea     ==> Circle클래스를 상속하시오
   +CircleArea(r:int)
   +compute():void            ==> 원의 넓이=반지름 *반지름*3.141592
   +output():void               ==> 출력      
       
(3)클래스명 :  CircleRound    ==> Circle클래스를 상속하시오
   +CircleRound(r:int)
   +compute():void              ==>원의둘레=반지름 * 2 * 3.141592
   +output():void                 ==>출력

(4)Test43클래스 main()에서
   CircleArea   ob1 = new CircleArea(10);
   CircleRound  ob2 = new CircleRound(10);
   ob1.compute();
   ob1.output();
   ob2.compute();
   ob2.output();

[결과화면]
원의넓이 : 314.1592
원의둘레 : 62.83184
 */

class Circle {
	private int r;
	private double size;
	private final double PI;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	
	protected Circle(int r, double size, double pI) {
		super();
		this.r = r;
		this.size = size;
		PI = pI;
	}

	public void compute(int r, double pI) {
		this.r=r;
		PI=pI;
		r*r*pI;
	}
	public void output() {
		System.out.println("");
	}
	}
	
class CircleArea extends Circle {

	public CircleArea(int r) {
		super(r);
	}
		
	
	@Override
	public void compute(int r,  ) {
		super.r=r;
		super.PI=PI;
		
		
	}
	public void output() {
		System.out.println(r*r*PI);
	}
	
}
class CircleRound extends Circle {






class Test43 {

	public static void main(String[] args) {
		 CircleArea   ob1 = new CircleArea(10);
		   CircleRound  ob2 = new CircleRound(10);
		   ob1.compute();
		   ob1.output();
		   ob2.compute();
		   ob2.output();

		 System.out.println("원의 넓이 :");
	}
}
