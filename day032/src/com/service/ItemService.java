package com.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.ItemMapper;
import com.vo.ItemVO;
@org.springframework.stereotype.Service("iservice")
public class ItemService implements Service<Integer, ItemVO> {
	
	@Autowired
	ItemMapper dao;

	@Override
	public void register(ItemVO v) throws Exception {
		dao.insert(v);		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(ItemVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public ItemVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ItemVO> get() throws Exception {
		return dao.selectall();
	}

	// ws
	public List<ItemVO> searchname(String name) throws Exception{
		return dao.searchname(name);
	}
	
	@Autowired
	ItemMapper dao1;
	public List<ItemVO> searchprice(Map<String,Integer> map) throws Exception{
		return dao1.searchprice(map);
	}
	
	public List<ItemVO> searchdate(String date) throws Exception{
		return dao1.searchdate(date);
	}
}
