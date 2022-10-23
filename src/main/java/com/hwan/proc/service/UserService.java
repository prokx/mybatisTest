package com.hwan.proc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwan.proc.dao.UserDao;
import com.hwan.proc.dto.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public User select(String id) {
		return userDao.search(id);

	}
}
