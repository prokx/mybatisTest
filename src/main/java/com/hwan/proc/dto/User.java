package com.hwan.proc.dto;

import java.io.Serializable;



public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1842486161083460470L;
	private String id;
	private String pw;
	private String name;
		
	public User(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
