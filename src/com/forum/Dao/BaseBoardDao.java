package com.forum.Dao;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Basicboard;
import com.forum.bean.Managerecord;

public interface BaseBoardDao {
	/**
	 * �����Ӱ��
	 * @param user
	 */
	public boolean insert(Basicboard basicboard,FileInputStream fis);
	
	/**
	 * �޸��Ӱ��
	 * @param user
	 */
	public boolean update(Basicboard basicboard,FileInputStream fis);
	
	/**
	 * ɾ���Ӱ��,BigDecimal userid
	 * @param user
	 */
	public boolean delete(BigDecimal basicboard,BigDecimal userid);
	
	/**
	 * ���ð���
	 * @param mr
	 * @return
	 */
	public boolean setBaseBoardOwner(Managerecord mr);
	
	/**
	 * �������id��ѯ
	 * @return
	 */
	public List<Basicboard> queryPostByMainBoard(BigDecimal Mbid);
	
	/**
	 * ���ؼ��ֲ�ѯ
	 * @param Mbid
	 * @return
	 */
	public List<Basicboard> queryPostByKeyWords(BigDecimal Mbid,int order,String key);
}
