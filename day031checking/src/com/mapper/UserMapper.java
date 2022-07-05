package com.mapper;

import java.util.List;

import com.vo.UserVO;

public interface UserMapper {
	public void insert(Object obj)throws Exception;
	public void delete(Object obj)throws Exception;
	public void update(Object obj)throws Exception;
	
	public UserVO select(Object obj)throws Exception;
	public List<UserVO> selectall()throws Exception;
	public List<UserVO> searchname(String name) throws Exception;
		
	
}
