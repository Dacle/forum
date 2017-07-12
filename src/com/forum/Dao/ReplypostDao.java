package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Replypost;

public interface ReplypostDao {
	/**
	 * �����ظ�
	 * @param user
	 */
	public boolean insert(Replypost replypost);
	
	/**
	 * ɾ���ظ�
	 * @param user
	 */
	public boolean delete(BigDecimal replypostid);
	
	/**
	 * ������id��ѯ�ظ�
	 * @return
	 */
	public List<Replypost> queryPost(BigDecimal pid);
}
