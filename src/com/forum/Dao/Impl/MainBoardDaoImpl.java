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
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_add_mainboard(?,?,?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2,mainboard.getMboardname());
			cs.setInt(3,mainboard.getStateid().intValue());
			cs.setInt(4,managerid.intValue());
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
			if("��ӳɹ�".equals(res))
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
	public boolean update(Mainboard mainboard) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_EDIT_MAINBOARD(?,?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, mainboard.getMboardid().intValue());
			cs.setString(3,mainboard.getMboardname());
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
			if("true".equals(res))
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
	public boolean delete(BigDecimal mainboardid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Mainboard> queryMainBoard() {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("select F_SHOW_MAINBOARD(?) from dual");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.setInt(1, 1);
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
	public boolean addMainboardowner(Managerecord mr) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("call p_add_mainboardowner(?,?,?)");
			cs.setInt(1,mr.getBasicboard().intValue());
			cs.setInt(2,mr.getUser().intValue());
			cs.setInt(3,mr.getBemanageduserid().intValue());
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
	}

}
