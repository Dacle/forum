package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Secreplypost;

public interface SecreplyPostDao {
	/**
	 * 新增次级回复
	 * @param user
	 */
	public boolean insert(Secreplypost secreplypost);
	
	/**
	 * 删除次级回复
	 * @param user
	 */
	public boolean delete(BigDecimal secreplypostid);
	
	/**
	 * 根据帖子查找回复
	 * @param postid
	 * @return
	 */
	public List<Secreplypost> findSecReplyPost(BigDecimal postid);
	
	/**
	 * 递归查找次级回复贴
	 * @param postid
	 * @return
	 */
	public List<Secreplypost> findSRSecReplyPost(BigDecimal secpostid);
}
