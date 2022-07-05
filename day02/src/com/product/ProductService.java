package com.product;

import java.util.List;

import com.frame.Dao;
import com.frame.Service;
import com.vo.ProductVO;

public class ProductService implements Service<Integer,ProductVO>{

	Dao<Integer,ProductVO> dao;
		
	public ProductService(Dao<Integer, ProductVO> dao) {
		this.dao = dao;
	}

	@Override
	public void register(ProductVO v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(ProductVO v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductVO get(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductVO> get() {
		// TODO Auto-generated method stub
		return null;
	}


}
