package com.multi;

public class Controller {

	public static void main(String[] args) {
		Service service = new Service();
		UserVO user = new UserVO("id01","pwd01","lee");
		
		service.register(user);
		
	}

}
