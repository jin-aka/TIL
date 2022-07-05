package com.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Dao;
import com.frame.Service;
import com.vo.ProductVO;
@org.springframework.stereotype.Service("pservice")
public class ProductService implements Service<Integer,ProductVO>{

	@Autowired
	Dao<Integer,ProductVO> dao;

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
