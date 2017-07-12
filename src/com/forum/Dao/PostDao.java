package com.forum.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.forum.bean.Post;

public interface PostDao {
	/**
	 * ��������
	 * @param user
	 */
	public boolean insert(Post post);
	
	/**
	 * �޸�����
	 * @param user
	 */
	public boolean update(Post post);
	
	/**
	 * ɾ������
	 * @param user
	 */
	public boolean delete(Post post);
	
	/**
	 * ���ؼ��ֲ�ѯ����
	 * @return
	 */
	public List<Post> queryPost(BigDecimal bid,String keywords);
	
	/**
	 * �����û�������
	 * @param userid
	 * @return
	 */
	public List<Post> findUserPost(BigDecimal userid);
	
	/**
	 * ��ʾһ�������������
	 * @param bid
	 * @return
	 */
	public List<Post> showPost(BigDecimal bid);
	
	/**
	 * �����ӵ���
	 * @return
	 */
	public boolean addZan(BigDecimal postID);
	
	/**
	 * �ö�����
	 * @param postID
	 * @return
	 */
	public boolean setPostToTop(BigDecimal postID);
}
