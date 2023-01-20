package step00_과제4;
/*
 * [문제44] 오버라이드(override)를 이용하여 다음 프로그램을 작성하시오
(1)클래스명: Emp
   name:String                   ==> 초깃값 : 홍길동
   salary:int                        ==> 초깃값 : 32000000
   +getDisplay():String        ==> 이름과 연봉출력

(2)클래스명: EmpExt
   department:String        ==> 초깃값 : "홍보부";
   +getDisplay():String    ==> 부서출력

(3)Test44클래스 main()에서
    Emp ob = new EmpExt();   
    //나머지를 완성하시오

[결과화면]
이름 : 홍길동
연봉 : 32,000,000원   <----3자리마다 콤마(,)찍고 화폐단위 "원"을 붙여주시오(DecimalFormat이용)
부서 : 홍보부
 */

class Emp {
	String name="홍길동";
	int salary=32000000;
	
public Emp() {
	// TODO Auto-generated constructor stub
}

public Emp(String name, int salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public String getDisplay() {
	return "이름 : "+name+"연봉 :"+salary;
}
	

public class EmpExt {
	String department="홍보부";
	
	public EmpExt() {
		// TODO Auto-generated constructor stub
	}

	public EmpExt(String department) {
		super();
		this.department = department;
	}
	
	public String getDisplay() {
		return "부서 : "+department;
	}
}
}
public class work44 {

	public static void main(String[] args) {
		Emp ob = new Emp();
		ob.getDisplay();
		
		EmpExt ob1 = new EmpExt();
		ob.getDisplay();
		
	}

}
