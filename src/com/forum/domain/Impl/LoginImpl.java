package com.forum.domain.Impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forum.Dao.UserDao;
import com.forum.Dao.Impl.UserDaoImpl;
import com.forum.bean.User;
import com.forum.domain.Login;

@Transactional
@Service
public class LoginImpl implements Login{

	private String msg;
	private UserDao userDao = new UserDaoImpl();
	
	private User userTemp;
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		userTemp = userDao.query(user.getUsername());
		if(userTemp!=null && user.getUserpwd().equals(userTemp.getUserpwd())){
			msg = "µÇÂ½³É¹¦";
			user.setUserid(userTemp.getUserid());
		}else
			msg = "µÇÂ¼Ê§°Ü";

		System.out.println(this.getClass().getName()+msg);
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return msg;
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return userTemp;
	}
	
}
