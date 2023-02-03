package step00_과제3;
/* O
 * [문제 41] 다음 프로그램을 완성하시오
(1)클래스명 : Salary
  -name:String (이름)
  -salary:int  (연봉)
  +Salary()
  +Salary(name:String, salary:int) ==> name, salary에 대입
  +viewInfomation():void     ==> 메서드에서 이름과 연봉을 출력

(2)클래스명 : Test41   ==> Salary를 상속받음
  -department:String(부서)
  +Test41()
  +Test41(nameString, salary:int, department:String)
  +viewInfomation():void     ==> 부서 출력

(3)main()함수에서
   Test41  ob = new Test41("홍길동",85000000,"개발부"); 
   //나머지를 완성하시오
           :

[결과화면]
이름 : 홍길동
연봉 : 85000000
부서 : 개발부
  
 */

class Salary {
	String name;
	int salary;
	
	public Salary() {
		System.out.println("[결과화면]");
	}

	public Salary(String name, int salary) {
		this();
		this.name=name;
		this.salary=salary;
		viewInformation(name, salary);
	}
	public void viewInformation(String name, int salary) {
		System.out.println("이름 : "+name+"\n연봉 : "+salary);
	}
}
class Test41 extends Salary {
	String department;
	public Test41() {
		// TODO Auto-generated constructor stub
	}
	

	public Test41(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
		viewInformation();
	}
	public void viewInformation() {
		System.out.println("부서 : "+department);
	}
}
public class Work41 {
	public static void main(String[] args) {
		Test41 ob=new Test41("홍길동", 85000000, "개발부");
	}
}


