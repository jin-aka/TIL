package com.multi;

public class Service {
	Dao dao;
	
	public Service() {
		dao = new Dao();
	}
	
	public void register(UserVO user) {
		//security, log, transaction ���� �ڵ� �Է�
		dao.insert(user);
	}
}
