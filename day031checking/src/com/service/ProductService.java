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
	public void register(ProductVO v) throws Exception{
		dao.insert(v);		
	}

	@Override
	public void remove(Integer k)  throws Exception{
		dao.delete(k);		
	}

	@Override
	public void modify(ProductVO v)  throws Exception{
		dao.update(v);		
	}

	@Override
	public ProductVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ProductVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<ProductVO> searchname(String name) throws Exception{
		return dao.searchname(name);
	}
	
	public List<ProductVO> getrate(double rate) throws Exception{
		return dao.getrate(rate);
	}
}
