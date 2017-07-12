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
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_add_basicboard(?,?,?,?,?,?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2,basicboard.getUserstate().intValue());
			cs.setString(3,basicboard.getBoardname());
			cs.setString(4,basicboard.getReadme());
			cs.setInt(5, basicboard.getMainboard().intValue());
			cs.setInt(6, basicboard.getUser().intValue());
			cs.setBinaryStream(7, fis);
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
			if("����ɹ�".equals(res))
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
	public boolean update(Basicboard basicboard,FileInputStream fis) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_EDIT_BASICBOARD(?,?,?,?,?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2,basicboard.getMainboard().intValue());
			cs.setInt(3,basicboard.getBoardid().intValue());
			cs.setString(4,basicboard.getBoardname());
			cs.setString(5, basicboard.getReadme());
			cs.setBinaryStream(7, fis);
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
	public boolean delete(BigDecimal basicboard,BigDecimal userid) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("{?=call F_DELETE_BASICBOARD(?,?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2, basicboard.intValue());
			cs.setInt(3, userid.intValue());
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
	public boolean setBaseBoardOwner(Managerecord mr) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("call P_ADD_BASICBOARDOWNER(?,?,?)");
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

	@Override
	public List<Basicboard> queryPostByMainBoard(BigDecimal Mbid) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("select f_show_basicboard(?,?) from dual");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.setInt(1, 1);
			cs.setInt(2,Mbid.intValue());
			cs.execute();
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
	public List<Basicboard> queryPostByKeyWords(BigDecimal Mbid, int order, String key) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("select F_SEARCH_BASICBOARD(?,?,?) from dual");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.setInt(1, Mbid.intValue());
			cs.setInt(2,1);
			cs.setString(3, key);
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
