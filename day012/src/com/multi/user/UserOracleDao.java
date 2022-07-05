package com.multi.user;

import com.multi.frame.Dao;
import com.multi.vo.UserVO;

public class UserOracleDao implements Dao<UserVO> {

	@Override
	public void insert(UserVO v) {
		System.out.println("Inserted Oracle: "+v);
		
	}

}
