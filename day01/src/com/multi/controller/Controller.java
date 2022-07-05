package com.multi.controller;

import com.multi.frame.Service;
import com.multi.user.UserService;
import com.multi.vo.UserVO;

public class Controller {

	public static void main(String[] args) {
		Service service = null;
		
		service = new UserService();
		
		UserVO user = new UserVO("id01","pwd01","lee");
		service.register(user);
	}

}
