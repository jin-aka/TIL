package com.multi.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustVO {

	private String id;
	private String name;
	private String addr;
	private Date regdate;
	private String pwd;
	
	public CustVO(String id, String name, String pwd, String addr) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.addr = addr;
	}
	

}
