package db3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static db3.JdbcTemplate.*;

public class UserDao {
	public List<UserEntity> userList() {
//		List<UserEntity> entity=null; 
		List<UserEntity> list = new ArrayList<>(); /* 중요 */
		Statement stmt = null;
		Connection conn = getConnection();
		ResultSet rs = null;
		UserEntity entity = null; /* 중요 */

		try {
			String sql = "select* from userinfo";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

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
			close(rs);
			close(stmt);
			close(conn);
		}
		return list;
	}

	public UserEntity selectUser(String id) {
		UserEntity entity = null;
		Statement stmt = null;
		Connection conn = getConnection();
		ResultSet rss = null;

		String sql = "select* from userinfo where id='" + id+"'";
		try {
			stmt = conn.createStatement();
			rss = stmt.executeQuery(sql);

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
			close(rss);
			close(stmt);
			close(conn);
		}
		return entity;
	}

	public int insertUser(UserEntity userEntity) {    //객체를 받았기 때문에 객체에서 입력받은 값을 넘겨주어야 함.
		
		int n=0;
		Statement stmt=null;
		Connection conn=getConnection();
		
		String sql="insert into userinfo (num, id, passwd, name, score) "
				+ "values(stu_seq.nextval, '"+userEntity.getId()+"', "
						+ "'"+userEntity.getPasswd()+"', '"+userEntity.getName()+"', '"+userEntity.getScore()+"')";
	
		try {
			stmt=conn.createStatement();
			n=stmt.executeUpdate(sql);
			if(n>0)                  // 메인에서 이미 결과값을 만들었으므로 커밋처리만 하면 됨.			
				commit(conn);			
		} catch (SQLException e) {
			rollback(conn);
			n=0;                     // 롤백을 하다가 실패했을 경우에 초기화.
		} finally {
			if(stmt!=null)
			close(conn);
			close(stmt);
		}		
		return n;
	}
}
