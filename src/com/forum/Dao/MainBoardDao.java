package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Mainboard;
import com.forum.bean.Managerecord;

public interface MainBoardDao {
	/**
	 * ���������
	 * @param user
	 */
	public boolean insert(Mainboard mainboard,BigDecimal managerid);
	
	/**
	 * �޸������
	 * @param user
	 */
	public boolean update(Mainboard mainboard);
	
	/**
	 * ɾ�������
	 * @param user
	 */
	public boolean delete(BigDecimal mainboardid);
	
	/**
	 * ��ѯ���������
	 * @return
	 */
	public List<Mainboard> queryMainBoard();
	
	/**
	 * ������������
	 * @param mr
	 * @return
	 */
	public boolean addMainboardowner(Managerecord mr);
}
