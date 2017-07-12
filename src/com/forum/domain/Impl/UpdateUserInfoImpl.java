package com.forum.domain.Impl;

import com.forum.Dao.UserDao;
import com.forum.Dao.Impl.UserDaoImpl;
import com.forum.bean.User;
import com.forum.domain.UpdateUserInfo;

public class UpdateUserInfoImpl implements UpdateUserInfo{

	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public boolean setNewPWD(String name,String newPwd) {
		// TODO Auto-generated method stub
		return userDao.setNewPwd(name, newPwd);
	}

	@Override
	public boolean updateInfo(User user,String state) {
		// TODO Auto-generated method stub
		return userDao.update(user, state);
	}

}
