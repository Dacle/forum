package com.forum.domain;

import com.forum.bean.User;

public interface Login {
	public void login(User user);
	
	public String getMsg();
	
	public User getUser();
}
