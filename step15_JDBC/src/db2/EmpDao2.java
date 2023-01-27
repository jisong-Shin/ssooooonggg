package db2;
//dao : data access object --데이터에 접근하는 객체

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static db2.JdbcTemplate.getConnection;  //-- import를 직접 작성해줌
import static db2.JdbcTemplate.close;
import static db2.JdbcTemplate.commit;
import static db2.JdbcTemplate.rollback;

public class EmpDao2 {
	Connection conn=getConnection();
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	public void addressList() {
		String sql="select * from addressbook order by num desc";
				
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
//			if(rs!=null)
//				System.out.println("결과조회성공");
			
			while(rs.next()) {
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("phone")+"\t");
				System.out.println(rs.getString("addr"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
			
		}
		
	}
	public void addressInsert(String name, String phone, String addr) {
		Statement stmt=null;
		Connection conn=getConnection();
		
		String sql=
				"insert into addressbook (num,name,phone,addr) "
				+ "values(num_seq.nextval, '"+name+"','"+phone+"','"+addr+"')";
		
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
		}finally {
		   try {
				if(stmt!=null)
				stmt.close();
		} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
	}
	}
	public boolean addressSearch(String name) {
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		boolean ck=false;
		
		try {
			String sql="select * from addressbook (name) values ('"+name+"')";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				ck=true;
				System.out.print(rs.getInt("num")+"\t");     //별도의 문자열이므로 "" 안에 \t 넣으면 안됨.
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("phone")+"\t");
				System.out.println(rs.getString("addr"));
			}
		} catch (SQLException e) {
		
		} finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return ck;
	}
	public void addressUpdate(String name, String phone, String addr) {
		Connection conn=getConnection();
		Statement stmt=null;
		String sql="update addressbook set phone='"+phone+"', addr='"+addr+"' where name='"+name+"'";
		
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if(n>0) {
				conn.commit();
				System.out.println(n+"건의 데이터가 수정되었습니다.");
			}
			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("데이터 수정에 실패하였습니다.");
		} finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	public void addressDelete(String name) {
		Statement stmt=null;
		String sql="delete addressbook where name='"+name;
		
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			
			if(n>0) {
				conn.commit();
				System.out.println(n+"건의 데이터가 삭제되었습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		System.out.println("데이터 삭제에 실패하였습니다.");
		
	}finally {
		if (stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}}