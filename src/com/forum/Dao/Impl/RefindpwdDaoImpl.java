package com.forum.Dao.Impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.forum.Dao.BaseDao;
import com.forum.Dao.RefindpwdDao;
import com.forum.bean.Refindpwd;

public class RefindpwdDaoImpl extends BaseDao implements RefindpwdDao{
	
	private Connection conn;
	
	private CallableStatement cs;
	@Override
	public boolean refindPwd(Refindpwd rp) {
		// TODO Auto-generated method stub
		boolean rs=true;
		try{ //调用数据库中的存储过程
			cs = conn.prepareCall("{?=call F_RefindPWD(?,?,?)}");
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, rp.getComp_id().getUserid().intValue());
			cs.setString(2, rp.getComp_id().getQuestion());
			cs.setString(2, rp.getAnswer());
			String res = cs.getString(1);
			if("密码重置成功".equals(res))
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

}
