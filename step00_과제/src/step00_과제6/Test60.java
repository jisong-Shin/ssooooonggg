package step00_과제6;

/*
 *[문제 60] 다음 프로그램을 작성하시오
(1) 프로젝트명 : ScoreProject
(2) 테이블명: student
   컬럼명 :    mid     숫자, 기본키
             name  가변형(15),널값허용안함
              kor     숫자
	          eng    숫자
	          mat   숫자
   시퀀스 :   m_mid(1부터 1씩증가)
   입력자료 :  민들래, 90, 88, 75
            진달래, 80, 88, 65

(3)구조
  ScoreProject
     src 
        table_schma
               student.sql
        common
               JdbcTemplate.java
        com.edu.view
               StudentMain.java   <---main()메서드
	 StudentView.java  
        com.edu.entity
              Student.java
        com.edu.dao
              StudentDAO.java
        com.edu.controller
              StudentController.java     

(4)조건
     1) StudentMain : 입력 코드를 완성한다
         menu()는 StudentMain에서 만들고, 모든 결과 출력은 StudentView에서 한다       

     2) Student
            -mid:int    
            -name:String    
            -kor:int
            -eng:int
            -mat:int
            -rank:int      --순위

            +Student()
            +Student(mid:int,name:String,kor:int,eng:int,mat:int,rank:int)
            +getter & setter
            +getTot():int
            +getAvg():double
            +getGrade():char
            +getResult():String
            +toString():String      ---> 출력문장을 만들어서 리턴(getTot, getAvg,getGrade, getResult이용)

      3) StudentController
            dao:StudentDao
            view:StudentView
            +StudentController()                      --> dao, view객체의 메모리 할당
            +getStudentList():void
            +getStudent(name:String):void            
            +insertStudent(ob:Student):String     --> 국,영,수 점수가 0~100사이인지 확인한후 dao로 값 전달         
	                                                        0~100이외의 값이면 StudentMain으로
				             "입력값에 오류가 있습니다"를 리턴(유효성 검사)
            +deleteStudent(name:String):void
      4) StudentDAO 
            +getStudentList():ArrayList<Student>      ==> 전체보기
            +getStudent(name:String):Student          ==> 찾기
            +insertStudent(ob:Student):int                ==> 추가
            +deleteStudent(name:String):int              ==> 삭제 

      5) StudentView
           +insertStudent(n:int, name:String):void
           +deleteStudent(n:int, name:String):void
           +getStudentList(list:ArrayList<Student>):void
           +getStudent(ob:Student):void
      
      6) StudentMain
          sc:Scanner
          control:StudentController
          entity:Student
          +StudentMain()     -- sc, control, entity 객체의 메모리 할당 또는 초기화
          +menu():void        -- 메뉴화면 만들기  
          +main():void         -- main()에서 아래 코드만 추가하기
                  new StudentMain():menu(); 

[입.출력화면]
1.추가  2.삭제  3.전체보기  4.찾기  5.종료
선택(1~5) : 1

이름: 강호동 
국어: 90
영어: 80
수학: 100
강호동을 추가했습니다

1.추가  2.삭제  3.전체보기  4.찾기  5.종료
선택(1~5) : 1

이름: 강호동 
국어: 90
영어: 80
수학: 150
입력값에 오류가 있습니다

 1.추가  2.삭제  3.전체보기  4.찾기  5.종료
선택(1~5) : 3
번호  이름     국어   영어  수학   총점   평균   학점  결과  순위
----------------------------------------------------------------------
1      민들래  90  88  75   253  84.33       B       합격       2
2      진달래  65  55  43   163   54.33      F       불합격    3
3      강호동   90  80  100   270  90.00    A       합격       1

1.추가  2.삭제  3.전체보기  4.찾기  5.종료
선택(1~5) : 4
찾는사람 : 강호동
강호동의 총점은 270점이고  평균은 90.00점입니다     <---toString()으로 처리하시오
학점은 A이고  결과는  합격입니다                                  NumberFormat를 이용해서 소수점 2째자리까지 출력하시오

1.추가  2.삭제  3.전체보기  4.찾기  5.종료
선택(1~5) : 2
삭제할사람 : 강호동
삭제되었습니다

1.추가  2.삭제  3.전체보기  4 .찾기  5.종료
선택(1~5) : 5
*** 작업끝 ****
 */

public class Test60 {

	public static void main(String[] args) {

	}

}
