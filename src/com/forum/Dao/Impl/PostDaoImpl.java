package com.forum.Dao.Impl;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.forum.Dao.BaseDao;
import com.forum.Dao.PostDao;
import com.forum.bean.Post;
import com.forum.util.DbUtils;

public class PostDaoImpl extends BaseDao implements PostDao{
	private Connection conn;
	
	private CallableStatement cs;
	@Override
	public boolean insert(Post post) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_AddPost(?,?,?,?,?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2,post.getPosttitle());
			cs.setInt(3,post.getPosttype().intValue());
			cs.setString(4,post.getPostcontent());
			cs.setInt(5, post.getBasicboard().intValue());
			cs.setInt(6, post.getUser().intValue());
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
			if("�����ɹ�".equals(res))
				rs = true;
			else if("����ʧ��".equals(res))
				rs = false;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public boolean update(Post post) {
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_EditPost(?,?,?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, post.getPostid().intValue());
			cs.setString(3,post.getPosttitle());
			cs.setString(4,post.getPostcontent());
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
			if("�����ɹ�".equals(res))
				rs = true;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
		
	}

	@Override
	public boolean delete(Post post) {
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_DeletePost(?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, post.getPostid().intValue());
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
			if("ɾ���ɹ�".equals(res))
				rs = true;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
		
	}

	@Override
	public List queryPost(BigDecimal bid, String keywords) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("select F_SEARCH_POST(?,?) from dual");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.setInt(1, bid.intValue());
			cs.setString(2,keywords);
			//���շ���ֵ������ӡ
			rs = DbUtils.populate(cs.executeQuery(), Post.class);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public List<Post> showPost(BigDecimal bid) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("select F_SEARCH_POST(?) from dual");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.setInt(1, bid.intValue());
			//���շ���ֵ������ӡ
			rs = DbUtils.populate(cs.executeQuery(), Post.class);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public boolean addZan(BigDecimal postID) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_giveaZan(?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, postID.intValue());
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
			if("���޳ɹ�".equals(res))
				rs = true;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
	}
	
	@Override
	public boolean setPostToTop(BigDecimal postID) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_ToTop(?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, postID.intValue());
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
			if("�ö��ɹ�".equals(res))
				rs = true;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public List<Post> findUserPost(BigDecimal userid) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("select F_FindUserPost(?) from dual");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.setInt(1, userid.intValue());
			//���շ���ֵ������ӡ
			rs = DbUtils.populate(cs.executeQuery(), Post.class);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
	}
	
}
