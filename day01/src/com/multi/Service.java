package com.multi;

public class Service {
	Dao dao;
	
	public Service() {
		dao = new Dao();
	}
	
	public void register(UserVO user) {
		//security, log, transaction 등의 코드 입력
		dao.insert(user);
	}
}
