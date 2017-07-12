package com.forum.Dao.Impl;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.forum.Dao.BaseBoardDao;
import com.forum.Dao.BaseDao;
import com.forum.bean.Basicboard;
import com.forum.bean.Managerecord;
import com.forum.bean.Post;
import com.forum.util.DbUtils;

public class BaseBoardDaoImpl extends BaseDao implements BaseBoardDao{
	
	private Connection conn;
	
	private CallableStatement cs;
	
	@Override
	public boolean insert(Basicboard basicboard,FileInputStream fis) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_add_basicboard(?,?,?,?,?,?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2,basicboard.getUserstate().intValue());
			cs.setString(3,basicboard.getBoardname());
			cs.setString(4,basicboard.getReadme());
			cs.setInt(5, basicboard.getMainboard().intValue());
			cs.setInt(6, basicboard.getUser().intValue());
			cs.setBinaryStream(7, fis);
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("插入成功".equals(res))
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
	public boolean update(Basicboard basicboard,FileInputStream fis) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_EDIT_BASICBOARD(?,?,?,?,?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2,basicboard.getMainboard().intValue());
			cs.setInt(3,basicboard.getBoardid().intValue());
			cs.setString(4,basicboard.getBoardname());
			cs.setString(5, basicboard.getReadme());
			cs.setBinaryStream(7, fis);
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("true".equals(res))
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
	public boolean delete(BigDecimal basicboard,BigDecimal userid) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_DELETE_BASICBOARD(?,?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, basicboard.intValue());
			cs.setInt(3, userid.intValue());
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
	public boolean setBaseBoardOwner(Managerecord mr) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("call P_ADD_BASICBOARDOWNER(?,?,?)");
			cs.setInt(1,mr.getBasicboard().intValue());
			cs.setInt(2,mr.getUser().intValue());
			cs.setInt(3,mr.getBemanageduserid().intValue());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public List<Basicboard> queryPostByMainBoard(BigDecimal Mbid) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select f_show_basicboard(?,?) from dual");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(1, 1);
			cs.setInt(2,Mbid.intValue());
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
	public List<Basicboard> queryPostByKeyWords(BigDecimal Mbid, int order, String key) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select F_SEARCH_BASICBOARD(?,?,?) from dual");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(1, Mbid.intValue());
			cs.setInt(2,1);
			cs.setString(3, key);
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
