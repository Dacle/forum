package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.User;

public interface UserDao {
	/**
	 * ��ѯ�û�
	 * @param user �����û����ֵ��ַ���
	 * @return ����ѯ���û�������Ϣ
	 */
	public User query(String userName);
	
	/**
	 * �����û�
	 * @param user
	 * @return 
	 */
	public boolean insert(User user);
	
	/**
	 * �޸��û���Ϣ
	 * @param user
	 */
	public boolean update(User user,String state);
	
	public boolean setNewPwd(String name,String newPwd);
	
	/**
	 * ɾ���û���������ɾ����
	 * @param user
	 */
	public boolean delete(User user);
	
	/**
	 * ��ѯ�����û�
	 * @return
	 */
	public List<User> queryUser();
	
	/**
	 * ��ѯ�Ӱ������б�
	 * @return
	 */
	public List<User> searchBasicBoardOwnerList(BigDecimal mainBoardID);
	
	/**
	 * ע��
	 * @param name
	 * @return
	 */
	public boolean logout(String name);
}
