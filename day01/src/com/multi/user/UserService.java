package com.multi.user;

import com.multi.frame.Dao;
import com.multi.frame.Service;
import com.multi.vo.UserVO;

public class UserService implements Service<UserVO> {

	Dao<UserVO> dao;
	
	public UserService() {
		dao = new UserDao();
	}
	
	@Override
	public void register(UserVO v) {
		dao.insert(v);
	}

}
