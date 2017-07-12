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
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_AddPost(?,?,?,?,?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2,post.getPosttitle());
			cs.setInt(3,post.getPosttype().intValue());
			cs.setString(4,post.getPostcontent());
			cs.setInt(5, post.getBasicboard().intValue());
			cs.setInt(6, post.getUser().intValue());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("发帖成功".equals(res))
				rs = true;
			else if("发帖失败".equals(res))
				rs = false;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public boolean update(Post post) {
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_EditPost(?,?,?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, post.getPostid().intValue());
			cs.setString(3,post.getPosttitle());
			cs.setString(4,post.getPostcontent());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("修帖成功".equals(res))
				rs = true;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
		
	}

	@Override
	public boolean delete(Post post) {
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_DeletePost(?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, post.getPostid().intValue());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("删帖成功".equals(res))
				rs = true;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
		
	}

	@Override
	public List queryPost(BigDecimal bid, String keywords) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select F_SEARCH_POST(?,?) from dual");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(1, bid.intValue());
			cs.setString(2,keywords);
			//接收返回值，并打印
			rs = DbUtils.populate(cs.executeQuery(), Post.class);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public List<Post> showPost(BigDecimal bid) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select F_SEARCH_POST(?) from dual");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(1, bid.intValue());
			//接收返回值，并打印
			rs = DbUtils.populate(cs.executeQuery(), Post.class);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public boolean addZan(BigDecimal postID) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_giveaZan(?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, postID.intValue());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("点赞成功".equals(res))
				rs = true;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}
	
	@Override
	public boolean setPostToTop(BigDecimal postID) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_ToTop(?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, postID.intValue());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("置顶成功".equals(res))
				rs = true;
			else
				rs = false;
			System.out.println(this.getClass().getName()+"   result   :"+res);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public List<Post> findUserPost(BigDecimal userid) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select F_FindUserPost(?) from dual");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(1, userid.intValue());
			//接收返回值，并打印
			rs = DbUtils.populate(cs.executeQuery(), Post.class);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}
	
}
