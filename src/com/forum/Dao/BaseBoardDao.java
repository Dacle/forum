package com.forum.Dao;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Basicboard;
import com.forum.bean.Managerecord;

public interface BaseBoardDao {
	/**
	 * 新增子版块
	 * @param user
	 */
	public boolean insert(Basicboard basicboard,FileInputStream fis);
	
	/**
	 * 修改子版块
	 * @param user
	 */
	public boolean update(Basicboard basicboard,FileInputStream fis);
	
	/**
	 * 删除子版块,BigDecimal userid
	 * @param user
	 */
	public boolean delete(BigDecimal basicboard,BigDecimal userid);
	
	/**
	 * 设置版主
	 * @param mr
	 * @return
	 */
	public boolean setBaseBoardOwner(Managerecord mr);
	
	/**
	 * 按主版块id查询
	 * @return
	 */
	public List<Basicboard> queryPostByMainBoard(BigDecimal Mbid);
	
	/**
	 * 按关键字查询
	 * @param Mbid
	 * @return
	 */
	public List<Basicboard> queryPostByKeyWords(BigDecimal Mbid,int order,String key);
}
