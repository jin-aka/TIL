package com.item;

import java.util.ArrayList;
import java.util.List;

import com.frame.Dao;
import com.vo.ItemVO;

public class ItemDao implements Dao<String, ItemVO> {

	@Override
	public void insert(ItemVO v) {
		System.out.println("Inserted: "+v);		
	}

	@Override
	public void delete(String k) {
		System.out.println("Deleted: "+k);			
	}

	@Override
	public void update(ItemVO v) {
		System.out.println("update: "+v);	
	}

	@Override
	public ItemVO select(String k) {
		ItemVO item = new ItemVO(k, "500", "1111");
		return item;
	}

	@Override
	public List<ItemVO> select() {
		ArrayList<ItemVO> list = new ArrayList<ItemVO>();
		list.add(new ItemVO("it01","100","1111"));
		list.add(new ItemVO("it02","200","2222"));
		list.add(new ItemVO("it03","300","3333"));
		list.add(new ItemVO("it04","400","4444"));
		list.add(new ItemVO("it05","500","5555"));
		
		return null;
	}

}
