package step00_과제4;

import java.util.Scanner;

abstract /*
 * [문제46] 동적바인딩(Dynamic Binding)을 이용하여 다음 프로그램을 완성하시오
(1)클래스명 : Shape
   -nData1:int
   -nData2:int
   +Shape(int data1, int data2)
    +getter    
    +getArea():double            ==> abstract 
(2)클래스명 : Triangle              ==> Shape를 상속받음
   +Triangle(data1:int, data2:int)
   +getArea():double 
(4)클래스명 : Rectangle           ==> Shape를 상속받음
   +Rectangle(data1:int, data2:int)
   +getArea():double

(5)Test46클래스의 main()메서드에서 아래코드외에 나머지를 완성하시오
   Shape ob=null;
   Scanner sc=new Scanner(System.in);
   while(true){
             System.out.print("1.삼각형 2. 사각형  3. 종  료\n선택(1-3)");
             int n=sc.nextInt();
	                 :
   }

[결과화면]
1. 삼각형  2. 사각형  3. 종  료
선택(1-3) : 1
밑변 : 2
높이 : 3
넓이 : 6.00


1. 삼각형  2. 사각형  3. 종  료
선택(1-3) : 2
가로 : 4
세로 : 5
넓이 : 20
 */
class Shape {
	int nData1;
	int nData2;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	protected Shape(int nData1, int nData2) {
		super();
		this.nData1 = nData1;
		this.nData2 = nData2;
	}
	public int getnData1() {
		return nData1;
	}
	public int getnData2() {
		return nData2;
	}
	abstract double getArea();
}

abstract class Triangle extends Shape {
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Triangle(int nData1, int nData2) {
		super.nData1=nData1;
		super.nData2=nData2;
	}
	public double getArea() {
		return getnData1()*getnData2();
	}
}

abstract class Rectangle extends Shape {
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int nData1, int nData2) {
		super.nData1=nData1;
		super.nData2=nData2;
	}
	public double getArea() {
		return getnData1()*getnData2();
	}
}


public class work46 {

	public static void main(String[] args) {
		 Shape ob=null;
		   Scanner sc=new Scanner(System.in);
		   while(true){
		       System.out.print("1.삼각형 2. 사각형  3. 종  료\n선택(1-3)");
		       int n=sc.nextInt();
		   if(n==1) {
		   Shape sh=null;
		   sh=Triangle(2,3);
		   System.out.println("밑변 : "+sh.nData1);
		   System.out.println("높이 : "+sh.nData2);
		   System.out.println("넓이 : "+sh.getArea());
		   } else if(n==2){
		   Shape rh=null;
		   rh=Rectangle(4,5);
		   System.out.println("가로 : "+rh.nData1);
		   System.out.println("세로 : "+rh.nData2);
		   System.out.println("넓이 : "+rh.getArea()); 
		   }

	private static Shape Rectangle(int i, int j) {
		return null;
	}

	private static Shape Triangle(int i, int j) {
		return null;
	}

}
