package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Replypost;

public interface ReplypostDao {
	/**
	 * 新增回复
	 * @param user
	 */
	public boolean insert(Replypost replypost);
	
	/**
	 * 删除回复
	 * @param user
	 */
	public boolean delete(BigDecimal replypostid);
	
	/**
	 * 按帖子id查询回复
	 * @return
	 */
	public List<Replypost> queryPost(BigDecimal pid);
}
