package com.forum.domain.Impl;

import com.forum.Dao.UserDao;
import com.forum.Dao.Impl.UserDaoImpl;
import com.forum.bean.User;
import com.forum.domain.Register;

public class RegisterImpl implements Register{
	
	private UserDao userDao = new UserDaoImpl();
	
	private String msg;
	 
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub;
		if(userDao.insert(user))
			msg="×¢²á³É¹¦";
		else
			msg="×¢²áÊ§°Ü";
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return msg;
	}

}
