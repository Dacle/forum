package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Secreplypost;

public interface SecreplyPostDao {
	/**
	 * �����μ��ظ�
	 * @param user
	 */
	public boolean insert(Secreplypost secreplypost);
	
	/**
	 * ɾ���μ��ظ�
	 * @param user
	 */
	public boolean delete(BigDecimal secreplypostid);
	
	/**
	 * �������Ӳ��һظ�
	 * @param postid
	 * @return
	 */
	public List<Secreplypost> findSecReplyPost(BigDecimal postid);
	
	/**
	 * �ݹ���Ҵμ��ظ���
	 * @param postid
	 * @return
	 */
	public List<Secreplypost> findSRSecReplyPost(BigDecimal secpostid);
}
