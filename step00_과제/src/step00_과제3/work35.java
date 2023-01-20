package step00_과제3;

import java.util.Scanner;

/*
 * ﻿[문제 35] 원의 반지름을 입력받아 넓이를 계산하고 출력하시오
(1)클래스명: Circle
        -r:int                          ==> 반지름을 저장할 정수형변수
       -PI:double                   ==> 초기값=3.141592 , final키워드

       +Circle()                      ==> Scanner이용해서 입력받을것
       +process():double        ==> 원의넓이를 계산해서 리턴
       +output():void             ==> 결과를 출력
(2) main()에서
       Circle ob=new Circle();
       ob.output();

[결과화면]
반지름을 입력하시오 : 10
원의넓이 : 314.1
 */

class Circle {
	
	int r;
	double PI=3.141592;
	
	
	public Circle() {
		Scanner sc=new Scanner(System.in);
		 System.out.print("반지름을 입력하시오 : ");
		sc.nextLine();
		 
	}
	
	
	public Circle(int r, double pI) {
		super();
		this.r = r;
		PI = pI;
	}

	public double process(int r, double pI) {
		return r*PI;
	}
	public void output() {
		System.out.println("원의 넓이 : "+(double)r*PI);
		
	}
}
public class work35 {

	public static void main(String[] args) {
		 Circle ob=new Circle();
	       ob.output();

	}

}
