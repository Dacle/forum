package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Mainboard;
import com.forum.bean.Managerecord;

public interface MainBoardDao {
	/**
	 * 新增主版块
	 * @param user
	 */
	public boolean insert(Mainboard mainboard,BigDecimal managerid);
	
	/**
	 * 修改主版块
	 * @param user
	 */
	public boolean update(Mainboard mainboard);
	
	/**
	 * 删除主版块
	 * @param user
	 */
	public boolean delete(BigDecimal mainboardid);
	
	/**
	 * 查询所有主版块
	 * @return
	 */
	public List<Mainboard> queryMainBoard();
	
	/**
	 * 设置主版块版主
	 * @param mr
	 * @return
	 */
	public boolean addMainboardowner(Managerecord mr);
}
