package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.ProductMapper;
import com.vo.ProductVO;
@org.springframework.stereotype.Service("pservice")
public class ProductService implements Service<Integer, ProductVO> {
	
	@Autowired
	ProductMapper dao;
	
	@Override
	public void register(ProductVO v) {
		dao.insert(v);		
	}

	@Override
	public void remove(Integer k) {
		dao.delete(k);		
	}

	@Override
	public void modify(ProductVO v) {
		dao.update(v);		
	}

	@Override
	public ProductVO get(Integer k) {
		return dao.select(k);
	}

	@Override
	public List<ProductVO> get() {
		return dao.selectall();
	}

}
