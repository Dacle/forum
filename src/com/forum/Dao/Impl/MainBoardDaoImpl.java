package com.forum.Dao.Impl;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.forum.Dao.BaseDao;
import com.forum.Dao.MainBoardDao;
import com.forum.bean.Mainboard;
import com.forum.bean.Managerecord;
import com.forum.bean.Post;
import com.forum.util.DbUtils;

public class MainBoardDaoImpl extends BaseDao implements MainBoardDao{
	
	private Connection conn;
	
	private CallableStatement cs;
	
	@Override
	public boolean insert(Mainboard mainboard,BigDecimal managerid) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_add_mainboard(?,?,?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2,mainboard.getMboardname());
			cs.setInt(3,mainboard.getStateid().intValue());
			cs.setInt(4,managerid.intValue());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("添加成功".equals(res))
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
	public boolean update(Mainboard mainboard) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_EDIT_MAINBOARD(?,?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, mainboard.getMboardid().intValue());
			cs.setString(3,mainboard.getMboardname());
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
	public boolean delete(BigDecimal mainboardid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Mainboard> queryMainBoard() {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select F_SHOW_MAINBOARD(?) from dual");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(1, 1);
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
	public boolean addMainboardowner(Managerecord mr) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("call p_add_mainboardowner(?,?,?)");
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

}
