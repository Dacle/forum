package com.forum.Dao.Impl;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.forum.Dao.BaseDao;
import com.forum.Dao.ReplypostDao;
import com.forum.bean.Post;
import com.forum.bean.Replypost;
import com.forum.util.DbUtils;

public class ReplypostDaoImpl extends BaseDao implements ReplypostDao{

	private Connection conn;
	
	private CallableStatement cs;
	@Override
	public boolean insert(Replypost replypost) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();
		try{ 
			cs = conn.prepareCall("{?=call F_AddReplyPost(?,?,?,?)}");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2,replypost.getUser().intValue());
			cs.setInt(3,replypost.getPost().intValue());
			cs.setString(4,replypost.getReplytitle());
			cs.setString(5, replypost.getReplycontent());
			cs.execute();
			//���շ���ֵ������ӡ
			String res = cs.getString(1);
			if("�ظ��ɹ�".equals(res))
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
	public boolean delete(BigDecimal replypostid) {
		// TODO Auto-generated method stub
		boolean rs = true;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("delete from replypost where replypostid = ?");
			cs.setInt(2,replypostid.intValue());
			if(cs.execute())
				rs = true;
			else
				rs = false;
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر���������
			closeAll(conn, cs, null);
		}
		return rs;
	}

	@Override
	public List<Replypost> queryPost(BigDecimal pid) {
		// TODO Auto-generated method stub
		List rs = null;
		conn =getConnection();/*���ݿ��������*/
		try{ //�������ݿ��еĴ洢����
			cs = conn.prepareCall("select F_FindReplyPost(?) from dual");/*��һ������ȡ�������ؽ�������漸����ȡ�������*/
			cs.setInt(1, pid.intValue());
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

}
