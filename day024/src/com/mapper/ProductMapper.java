package com.mapper;

import java.util.List;

import com.vo.ProductVO;

public interface ProductMapper {
	public void insert(ProductVO obj);
	public void delete(int obj);
	public void update(ProductVO obj);
	
	public ProductVO select(int obj);
	public List<ProductVO> selectall();
		
	
}
