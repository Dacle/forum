package com.forum.domain;

import com.forum.bean.User;

public interface Register {
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public String getMsg();
}
