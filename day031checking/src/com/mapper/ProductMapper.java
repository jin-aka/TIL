package com.mapper;

import java.util.List;

import com.vo.ProductVO;

public interface ProductMapper {
	public void insert(ProductVO obj)throws Exception;
	public void delete(int obj)throws Exception;
	public void update(ProductVO obj)throws Exception;
	
	public ProductVO select(int obj)throws Exception;
	public List<ProductVO> selectall()throws Exception;
	public List<ProductVO> searchname(String name)throws Exception;
	public List<ProductVO> getrate(double rate) throws Exception;		
	
}
