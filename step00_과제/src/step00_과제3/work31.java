package step00_과제3;
/*
 * [문제31]다음을 수정/완성하시오
(1)클래스명:Test31
     필드명 : -base:double  (초기값:5.0)
                 -height:double (초기값:3.5)
     메서드명: +getArea():double
                   +getHypotenuse():double 
                   +getPerimeter():double
(2)조건
   1)공  식 : 삼각형의 넓이 = (밑변 * 높이) /2
                 빗변길이 = Math.sqrt(밑변*밑변+높이*높이)  
                 둘레길이 = 밑변 + 높이 + 빗변길이 
   2) getArea()는 삼각형의 넓이를 리턴한다
       getHypotenuse() 빗변의 길이를 리턴한다
       getPerimeter()는 둘레길이를 리턴한다
   3) main에서 Test31으로 객체 ob를 생성한다 
           Sytem.out.println("삼각형의 넓이 :" + ob.getArea());

[출력화면]
삼각형의넓이 : 8.75
빗변길이 : 6.10
둘레길이 : 14.60
 */
class Test31 {
	private double base=5.0;
	private double height=3.5;
	
	public Test31() {
		System.out.println("[출력화면]");
	}
	
public Test31(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

public double getArea() {
	return base*height/2;
}
public double getHypotenuse()  {
	return Math.sqrt((base*base)+(height*height));
}

public double getPerimeter() {
	return base+height+getHypotenuse();
}

	public static void main(String[] args) {
		Test31 ob=new Test31();
		
		System.out.println("삼각형의 넓이 :" + ob.getArea());
		System.out.println("빗변길이 :" + ob.getHypotenuse());
		System.out.println("둘레길이 :" + ob.getPerimeter());

	}

}
