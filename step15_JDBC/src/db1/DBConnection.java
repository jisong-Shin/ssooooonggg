package db1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * DB연결 과정
 * 1.드라이버 로드 (ojdbc로드)
 * 2.연결 객체 생성(ex_로그인)
 * 3.sql 문장 실행
 * 4. 결과(ResultSet) 리턴
 * 5. 객체 닫기
 */

public class DBConnection {
	Connection conn=null;
	public DBConnection() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}                                                            		     //1.드라이버로드
				try {	
					conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234"); 	//2. 연결객체생성
					conn.setAutoCommit(false);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
		    if(conn!=null)
		    	System.out.println("연결 성공~");
			
		
	}
//-----------------------------------------------------------------------Statement
	public void addressInsert(String name, String phone, String addr) {
		Statement stmt=null;
		
		
		String sql="insert into addressbook (num, name, phone, addr) "
				+ "values(num_seq.nextval, '"+name+"', '"+phone+"', '"+addr+"')";
//		System.out.println(sql);
		
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if(n>0) {
				conn.commit();
				System.out.println(n+"건의 데이터가 추가되었습니다.");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 추가에 실패하였습니다.");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
			if(stmt!=null)
				stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}}}
	
//-----------------------------------------------------------------------PreparedStatement
	
	
//	public void addressInsert(String name, String phone, String addr) {
//		
//		PreparedStatement pstmt=null;
//		
//		String sql="insert into addressbook(num, name, phone, addr) values (num_seq.nextval,?,?,?)";
//		
//		
//		try {
//			
//			pstmt=conn.prepareStatement(sql);
//			//sql문장을 db에서 동작하는 pstmt객체로 포장해주는 과정
//			//conn 과 pstmt객체를 연결하는 초기화 작업
//			pstmt.setString(1, name);    //1번째 물음표
//			pstmt.setString(2, phone);    //2번째 물음표
//			pstmt.setString(3, addr);    //3번째 물음표
//			
//			int n=pstmt.executeUpdate();       //select를 제외한 것은 다 executeupdate()사용
//			
//			if(n>0) {
//				conn.commit();    //--연결객체에 대한 커밋
//				System.out.println(n+"건의 데이터가 추가되었습니다.");
//			}
//		} catch (SQLException e) {
//
//			try {
//				conn.rollback();
//				System.out.println("데이터 추가에 실패하였습니다.");
//			} catch (SQLException e1) {
//			}
//		} finally {
//			try {
//				if(pstmt!=null)
//					pstmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	
//-----------------------------------------------------------------------Statement

//	public void addressList() {
//		Statement stmt=null;
//		ResultSet rs=null;
//		
//		String sql="select * from addressbook";
//		try {
//			stmt=conn.createStatement();
//			rs=stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.print(rs.getInt("num")+"\t");
//				System.out.print(rs.getString("name")+"\t");
//				System.out.print(rs.getString("phone")+"\t");
//				System.out.println(rs.getString("addr"));
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			if(rs!=null)
//				try {
//					rs.close();
//					if(stmt!=null)
//						stmt.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//		}
//	}
//
//	}
	
//------------------------------------------------------------------------PreparedStatement
	public void addressList() {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from addressbook";                                  //3. sql문장 실행
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();	                                    	//4. 결과 리턴
			
//			while(rs.next()) {
//				System.out.println(rs.getInt("num")+"\t"); //rs.getInt(1)
//			}
		
			while(rs.next()) {
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("phone")+"\t");
				System.out.println(rs.getString("addr"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {                                            //5. 연결객체 해제
			try {
				if(rs!=null)  rs.close();
				if(pstmt!=null)  pstmt.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

//------------------------------------------------------------------------PreparedStatement
//	public void addressUpdate(int num, String phone, String addr) {
//		PreparedStatement pstmt = null;
//
//		String sql = "update addressbook set phone=?, addr=? where num=?";
//
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, phone);
//			pstmt.setString(2, addr);
//			pstmt.setInt(3, num);
//			int n = pstmt.executeUpdate();
//
//			if (n > 0)
//				conn.commit();
//			System.out.println(n + "건의 데이터가 수정되었습니다.");
//
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 수정에 실패하였습니다.");
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} finally {
//				try {
//					if (pstmt != null)
//						pstmt.close();
//				} catch (Exception e2) {
//				}
//			}
//		}
//	}
//}
//------------------------------------------------------------------------Statement
//	public void addressUpdate(int num, String phone, String addr) {
//		Statement stmt = null;
//		String sql = "update addressbook set phone='" + phone + "', addr='" + addr + "' where num=" + num;
////		System.out.println(sql);
//
//		try {
//			stmt = conn.createStatement();
//			int n = stmt.executeUpdate(sql);
//
//			if (n > 0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터가 수정되었습니다.");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 수정에 실패하였습니다.");
//			} catch (SQLException e1) {
//
//			} finally {
//				try {
//					if (stmt != null) stmt.close();
//				} catch (Exception e2) {
//				}
//			}
//		}
//	}
//}
//------------------------------------------------------------------------Statement
	public void addressDelete(int num) {
		Statement stmt = null;
		String sql = "delete addressbook where num="+num;
		
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			
			if (n > 0) {
				conn.commit();
				System.out.println(n + "건의 데이터가 삭제되었습니다.");
		}} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("데이터 삭제에 실패하였습니다.");
			
		}finally {
			try {
			if (stmt != null) stmt.close();
		} catch (Exception e2) {
		}
		}
	}
}
//------------------------------------------------------------------------PreparedStatement
//	public void addressDelete(int num) {
//		PreparedStatement pstmt = null;
//		String sql = "delete addressbook where num=?";
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, num);
//			int n=pstmt.executeUpdate();
//			
//			if (n > 0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터가 삭제되었습니다.");
//		}} catch (SQLException e) {
//			try {
//				conn.rollback();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			System.out.println("데이터 삭제에 실패하였습니다.");
//			
//		}finally {
//			try {
//			if (pstmt != null) pstmt.close();
//		} catch (Exception e2) {
//		}
//		}
//	}
//}
	
	
//------------------------------------------------------------------------Statement
		
		
		
		
		
		
		
		
