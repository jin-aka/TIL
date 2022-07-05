package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.ProductVO;

@Repository
@Mapper
public interface ProductMapper {
	public void insert(ProductVO prod) throws Exception;
	public void delete(int k) throws Exception;
	public void update(ProductVO prod) throws Exception;
	public ProductVO select(int k) throws Exception;
	public List<ProductVO> selectall() throws Exception;

}
