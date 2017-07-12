package com.forum.domain;

import com.forum.bean.User;

public interface UpdateUserInfo {
	/**
	 * 更改密码
	 * @param user
	 * @return
	 */
	public boolean setNewPWD(String name,String newPwd);
	/**
	 * 更新资料
	 * @param user
	 * @return
	 */
	public boolean updateInfo(User user,String state);
}
