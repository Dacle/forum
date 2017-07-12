package com.forum.Dao.Impl;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.forum.Dao.BaseDao;
import com.forum.Dao.SecreplyPostDao;
import com.forum.bean.Post;
import com.forum.bean.Secreplypost;
import com.forum.util.DbUtils;

public class SecreplyPostDaoImpl extends BaseDao implements SecreplyPostDao{

	private Connection conn;
	
	private CallableStatement cs;
	
	@Override
	public boolean insert(Secreplypost secreplypost) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_AddSecReplyPost(?,?,?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2,secreplypost.getUser().intValue());
			cs.setInt(3,secreplypost.getSecid().intValue());
			cs.setString(4,secreplypost.getReplycontent());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("回复成功".equals(res))
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
	public boolean delete(BigDecimal secreplypostid) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("delete from secreplypost where secreplypostid = ?");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(2,secreplypostid.intValue());
			if(cs.execute())
				rs = true;
			else
				rs = false;
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public List findSecReplyPost(BigDecimal replypostid) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select F_FindSecReplyPost(?) from dual");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(1, replypostid.intValue());
			cs.execute();
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
	public List findSRSecReplyPost(BigDecimal secpostid) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select F_FindSRSecReplyPost(?) from dual");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(1, secpostid.intValue());
			cs.execute();
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
