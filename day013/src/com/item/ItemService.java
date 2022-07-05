package com.item;

import java.util.List;

import com.frame.Dao;
import com.frame.Service;
import com.vo.ItemVO;

public class ItemService implements Service<String, ItemVO> {
	
	Dao<String,ItemVO> dao;

	@Override
	public void register(ItemVO v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(ItemVO v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemVO get(String k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemVO> get() {
		// TODO Auto-generated method stub
		return null;
	}

}	