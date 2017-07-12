package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.User;

public interface UserDao {
	/**
	 * 查询用户
	 * @param user 包含用户名字的字符串
	 * @return 所查询的用户所有信息
	 */
	public User query(String userName);
	
	/**
	 * 新增用户
	 * @param user
	 * @return 
	 */
	public boolean insert(User user);
	
	/**
	 * 修改用户信息
	 * @param user
	 */
	public boolean update(User user,String state);
	
	public boolean setNewPwd(String name,String newPwd);
	
	/**
	 * 删除用户（真正的删除）
	 * @param user
	 */
	public boolean delete(User user);
	
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> queryUser();
	
	/**
	 * 查询子版块版主列表
	 * @return
	 */
	public List<User> searchBasicBoardOwnerList(BigDecimal mainBoardID);
	
	/**
	 * 注销
	 * @param name
	 * @return
	 */
	public boolean logout(String name);
}
