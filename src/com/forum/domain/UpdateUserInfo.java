package com.forum.domain;

import com.forum.bean.User;

public interface UpdateUserInfo {
	/**
	 * ��������
	 * @param user
	 * @return
	 */
	public boolean setNewPWD(String name,String newPwd);
	/**
	 * ��������
	 * @param user
	 * @return
	 */
	public boolean updateInfo(User user,String state);
}
