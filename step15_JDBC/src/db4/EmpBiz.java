package db4;

import java.util.List;

public class EmpBiz {

	public void addressList() {
		EmpDao dao=new EmpDao();
		List<EmpEntity> list=dao.addressList();
		
		EmpView view=new EmpView();
		view.addressList(list);
	}

}
