package com.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.vo.ItemVO;

public interface ItemMapper {
	public void insert(ItemVO obj)throws Exception;
	public void delete(int obj)throws Exception;
	public void update(ItemVO obj)throws Exception;
	
	public ItemVO select(int obj)throws Exception;
	public List<ItemVO> selectall()throws Exception;
	
	public List<ItemVO> searchname(String name)throws Exception;
	public List<ItemVO> searchprice(Map<String,Integer> map)throws Exception;
	public List<ItemVO> searchdate(String date)throws Exception;
}
