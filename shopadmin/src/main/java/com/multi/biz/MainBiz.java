package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.mapper.MainMapper;
import com.multi.vo.AdminVO;
import com.multi.vo.ProductVO;

@Service
public class MainBiz {

	@Autowired
	MainMapper dao;
	
	public int getCustCnt() throws Exception {
		return dao.getcustcnt();
	}
	
	public int getProductCnt() throws Exception {
		return dao.getproductcnt();
	}
	
	public List<ProductVO> searchProduct(String txt) throws Exception {
		return dao.searchproduct(txt);
	}
	
	public AdminVO getAdmin(String id) throws Exception{
		return dao.getadmin(id);
	}
}
