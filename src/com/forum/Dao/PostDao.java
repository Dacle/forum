package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Post;

public interface PostDao {
	/**
	 * 新增帖子
	 * @param user
	 */
	public boolean insert(Post post);
	
	/**
	 * 修改帖子
	 * @param user
	 */
	public boolean update(Post post);
	
	/**
	 * 删除帖子
	 * @param user
	 */
	public boolean delete(Post post);
	
	/**
	 * 按关键字查询帖子
	 * @return
	 */
	public List<Post> queryPost(BigDecimal bid,String keywords);
	
	/**
	 * 查找用户的帖子
	 * @param userid
	 * @return
	 */
	public List<Post> findUserPost(BigDecimal userid);
	
	/**
	 * 显示一个版块所有帖子
	 * @param bid
	 * @return
	 */
	public List<Post> showPost(BigDecimal bid);
	
	/**
	 * 给帖子点赞
	 * @return
	 */
	public boolean addZan(BigDecimal postID);
	
	/**
	 * 置顶帖子
	 * @param postID
	 * @return
	 */
	public boolean setPostToTop(BigDecimal postID);
}
