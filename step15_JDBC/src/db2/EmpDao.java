package db2;
//dao : data access object --데이터에 접근하는 객체

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static db2.JdbcTemplate.getConnection; //-- import를 직접 작성해줌
import static db2.JdbcTemplate.close;
import static db2.JdbcTemplate.commit;
import static db2.JdbcTemplate.rollback;

public class EmpDao {
	Connection conn = getConnection();
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void addressList() {
		String sql = "select * from addressbook order by num desc";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

//			if(rs!=null)
//				System.out.println("결과조회성공");

			while (rs.next()) {
				System.out.print(rs.getInt("num") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("phone") + "\t");
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
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		String sql = "insert into addressbook values(num_seq.nextval, ?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 추가되었습니다.");
			}

		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 추가에 실패하였습니다.");
		}

	}

	public boolean addressSearch(String name) {

		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean ck = false;

		try {
			String sql = "select * from addressbook where name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ck = true;
				System.out.print(rs.getInt("num") + "\t"); // 별도의 문자열이므로 "" 안에 \t 넣으면 안됨.
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("phone") + "\t");
				System.out.println(rs.getString("addr"));
			}
		} catch (SQLException e) {

		} finally {
			close(conn);
			close(rs);
			close(pstmt);
		}
		return ck;
	}

	public void addressUpdate(String name, String phone, String addr) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update addressbook set phone=?, addr=? where name=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, addr);
			pstmt.setString(3, name);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 수정되었습니다.");
			}

		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 수정에 실패하였습니다.");
		} finally {
			close(pstmt);
			close(conn);
		}

	}

	public void addressDelete(String name) {
		PreparedStatement pstmt = null;
		String sql = "delete addressbook where name=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			int n = pstmt.executeUpdate();

			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 삭제되었습니다.");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 삭제에 실패하였습니다.");
		} finally {
			close(conn);
			close(pstmt);
		}

	}

}
