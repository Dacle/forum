package com.forum.domain.Impl;

import java.util.List;

import com.forum.Dao.UserDao;
import com.forum.Dao.Impl.UserDaoImpl;
import com.forum.domain.SearchUser;

public class SearchUserImpl implements SearchUser{

	UserDao userDao = new UserDaoImpl();
	@Override
	public List searchAllUser() {
		// TODO Auto-generated method stub
		
		return userDao.queryUser();
	}

}
