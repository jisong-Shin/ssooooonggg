package db4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static db4.JdbcTemplate.*;

public class EmpDao {

	public List<EmpEntity> addressList() {
		
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		List<EmpEntity> list=new ArrayList<>();
		ResultSet rs=null;
		EmpEntity entity=null;
		
		String sql="select* from addressbook";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				entity=new EmpEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				entity.setAddr(rs.getString("addr"));
				list.add(entity);				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn);
			close(rs);
			close(pstmt);			
		}
		return list;
	}
	
}
