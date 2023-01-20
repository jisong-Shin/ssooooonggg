package step00_과제3;
/*
 * [문제 38] 다음과 같은 결과가 나오도록 수정하시오
         (단, main()안의 내용수정과 새로운 Method추가하지마시오)

[결과화면]
###인적사항###
이름 : 민들래
나이 : 23
신장 : 165.3 
------------------------
class Parent
{
	String name;
	public Parent(){	
		System.out.println("###인적사항###");
	}
	public Parent(String name){	

	}
	public void printView(){
		System.out.println("이름 : " + name);
	}
}
class Child extends Parent
{
	int age;
	float tall;
	
	public Child(String name, int age, float tall){

	}
	public void printView(){
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + tall);
	}
}
public class Test38 {
	public static void main(String[] args) {
		new Child("민들래", 23, 165.3f).printView();
	}
}
  
 */

class Parent{
	String name;
	public Parent(){	
		System.out.println("###인적사항###");
	}
	public Parent(String name){	

	}
	public void printView(){
		System.out.println("이름 : " + name);
	}
}
class Child extends Parent
{
	int age;
	float tall;
	
	public Child(String name, int age, float tall){
		super.name=name;
		this.age=age;
		this.tall=tall;

	}
	@Override
	public void printView(){
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + tall);
	}
}
public class work38 {

		public static void main(String[] args) {
			new Child("민들래", 23, 165.3f).printView();

	}

}
