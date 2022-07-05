package com.mapper;

import java.util.List;

import com.vo.UserVO;

public interface UserMapper {
	public void insert(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	
	public UserVO select(Object obj);
	public List<UserVO> selectall();
		
	
}
