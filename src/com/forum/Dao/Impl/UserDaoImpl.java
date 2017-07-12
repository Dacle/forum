package com.forum.Dao.Impl;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.forum.Dao.BaseDao;
import com.forum.Dao.UserDao;
import com.forum.bean.Post;
import com.forum.bean.User;
import com.forum.util.DbUtils;

public class UserDaoImpl extends BaseDao implements UserDao {
	
	private Connection conn;
	
	private CallableStatement cs;
	
	@Override
	public User query(String userName) {
		// TODO Auto-generated method stub
		conn =getConnection();/*数据库链接语句*/
		User rs = null;
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select * from Users where userName = ?");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setString(1,userName);
			 ResultSet res = cs.executeQuery();
			 List<?>  userlist = DbUtils.populate(res, User.class);
			 for(int i = 0 ; i<userlist.size() ; i++){
	                rs = (User) userlist.get(i);
	                System.out.println(rs.getUsername());
	            }
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		//String sql = "f_regist_users(?,?,?)";
		boolean rs = true;
		System.out.println(this.getClass().getName()+"  数据："+user.getUsername()+user.getUserpwd()+user.getSex());
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_Regist_Users(?,?,?)}");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2,user.getUsername());
			cs.setString(3,user.getUserpwd());
			cs.setString(4,user.getSex());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("用户注册成功".equals(res))
				rs = true;
			else if("用户名已存在".equals(res))
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
	public boolean update(User user,String state) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_UpdateInfo(?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, user.getUserid().intValue());
			cs.setString(3,user.getUsername());
			cs.setString(4,state);
			cs.setString(5,user.getEmail());
			cs.setString(6,user.getSex());
			cs.setString(7,user.getBirthday().toString());
			cs.setString(8,user.getSign());
			cs.setString(9,user.getPersonnelweb());
			cs.setString(10,user.getQq());
			cs.setString(11,user.getIntro());
			cs.setInt(12,user.getFacestate().intValue());
			cs.setInt(13,user.getSignstate().intValue());
			cs.execute();
			//接收返回值，并打印
			String res = cs.getString(1);
			if("用户注册成功".equals(res))
				rs = true;
			else if("用户名已存在".equals(res))
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
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List queryUser() {
		// TODO Auto-generated method stub
		List<?> userList = null;
		conn =getConnection();
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select * from Users");
			 ResultSet res = cs.executeQuery();
			 userList = DbUtils.populate(res, User.class);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return userList;
	}

	@Override
	public boolean setNewPwd(String name, String newPwd) {
		// TODO Auto-generated method stub
		boolean rs=true;
		conn =getConnection();
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_NewPWD(?,?)}");
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2, name);
			cs.setString(3,newPwd);
			String res = cs.getString(1);
			if("密码已更改".equals(res))
				rs=true;
			else
				rs=false;
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public boolean logout(String name) {
		// TODO Auto-generated method stub
		boolean rs=true;
		conn =getConnection();
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_Logout(?)}");
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2, name);
			String res = cs.getString(1);
			if("注销成功".equals(res))
				rs=true;
			else
				rs=false;
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭所有连接
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public List<User> searchBasicBoardOwnerList(BigDecimal mainBoardID) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*数据库链接语句*/
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("select * from table(F_FindUserPost(?))");/*第一个？获取函数返回结果，后面几个获取传入参数*/
			cs.setInt(1, mainBoardID.intValue());
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
