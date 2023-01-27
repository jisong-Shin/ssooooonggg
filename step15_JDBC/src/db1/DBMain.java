package db1;

public class DBMain {

	public static void main(String[] args) {
		DBConnection db=new DBConnection();
		// 추가하기
//		db.addressInsert("ddd", "010-444-4444", "강화도");
//		db.addressInsert("eee", "010-555-5555", "독도");
		
		// 수정하기
//		db.addressUpdate(2, "000-0000", "백령도");
//		db.addressUpdate(3, "333-3333", "거제도");
		
		// 삭제하기
		db.addressDelete(3);
		db.addressDelete(4);
		
		
		//전체목록조회
		db.addressList();
	}

}
