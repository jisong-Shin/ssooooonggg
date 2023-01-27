package db3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static db3.JdbcTemplate.*;

public class UserDao2 {
	public List<UserEntity> userList() {
//		List<UserEntity> entity=null; 
		List<UserEntity> list = new ArrayList<>(); /* 중요 */
		PreparedStatement pstmt = null;
		Connection conn = getConnection();
		ResultSet rs = null;
		UserEntity entity = null; /* 중요 */

		try {
			String sql = "select* from userinfo";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				entity = new UserEntity();
				entity.setNum(rs.getInt("num"));
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd"));
				entity.setName(rs.getString("name"));
				entity.setScore(rs.getDouble("score"));
				list.add(entity);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
	}

	public UserEntity selectUser(String id) {
		UserEntity entity = null;
		PreparedStatement pstmt = null;
		Connection conn = getConnection();
		ResultSet rss = null;

		String sql = "select* from userinfo where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rss = pstmt.executeQuery();

			while (rss.next()) {
				entity = new UserEntity();
				entity.setNum(rss.getInt("num"));
				entity.setId(rss.getString("id"));
				entity.setPasswd(rss.getString("passwd"));
				entity.setName(rss.getString("name"));
				entity.setScore(rss.getDouble("score"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rss.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return entity;
	}

	public int insertUser(UserEntity userEntity) {    //객체를 받았기 때문에 객체에서 입력받은 값을 넘겨주어야 함.
		
		int n=0;
		PreparedStatement pstmt=null;
		Connection conn=getConnection();
		
		String sql="insert into userinfo (num, id, passwd, name, score) "
				+ "values(stu_seq.nextval, ?,?,?,?)";
	
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userEntity.getId());
			pstmt.setString(2, userEntity.getPasswd());
			pstmt.setString(3, userEntity.getName());
			pstmt.setDouble(4, userEntity.getScore());
			n=pstmt.executeUpdate();
			
			if(n>0)                  		
				commit(conn);			
		} catch (SQLException e) {
			rollback(conn);
			n=0;                     
		} finally {
			if(pstmt!=null)
				try {
					conn.close();
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
		}		
		return n;
	}
}
