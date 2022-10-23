package com.hwan.proc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.hwan.proc.dto.User;

@Mapper
public interface UserDao {
	public User search(String id);
//	public void insert(User user);
//	public List<User> selectAll();
	
}
