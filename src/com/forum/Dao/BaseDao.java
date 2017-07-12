package com.forum.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ���ݿ������������
 * @author hyq
 * @since 2016-10-2
 * @modify by hyq
 */
public class BaseDao {
	/**
	 * ���ݿ������ַ���
	 */
	private String driver = "oracle.jdbc.driver.OracleDriver";
	 /**
	  * ����URL�ַ���
	  */
	private String url = "jdbc:oracle:thin:@localhost:1521:forumSystem";
	/**
	 * ���ݿ��û���
	 */
	private  String user = "forumAdmin"; 
	/**
	 * �û�����
	 */
	private  String password = "tomcat"; 
	/**
	 * �������Ӷ���
	 */
	Connection conn = null;
	
	/**
	 * �������ݿ�����
	 * @return ���ݿ����Ӷ���
	 */
	public Connection getConnection() {
		if(conn==null){
			// ��ȡ���Ӳ������쳣
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();// �쳣����
			}
		}	
		return conn;// �������Ӷ���
	}
	
	/**
	 * �ر����ݿ�����
	 * @param conn ���ݿ�����
	 * @param stmt Statement����
	 * @param rs �����
	 */
	public void closeAll(Connection conn, Statement stmt,ResultSet rs) {
		// �����������Ϊ�գ���ر�
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ��Statement����Ϊ�գ���ر�
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// �����ݿ����Ӷ���Ϊ�գ���ر�
		if (conn != null) {
			try {
				conn.close();
				conn=null;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ���ݱ������ɾ���ĵĲ���
	 * @param preparedSql Ԥ����� SQL ���          
	 * @param param Ԥ����� SQL ����еġ������������ַ�������          
	 * @return ��Ӱ�������
	 */
	public int exceuteUpdate(String preparedSql, Object[] param) {
		PreparedStatement pstmt = null;
		int num = 0;
		conn =  getConnection(); 
		try {
			pstmt = conn.prepareStatement(preparedSql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					pstmt.setObject(i + 1, param[i]); // ΪԤ����sql���ò���
				}
			}
			num = pstmt.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeAll(conn, pstmt, null);
		}
		return num;
	}
	
	/**
	 * ���ݱ�Ĳ��Ҳ���
	 * @param preparedSql Ԥ����� SQL ��� 
	 * @param param Ԥ����� SQL ����еġ������������ַ�������
	 * @return ��ѯ����ҵ��Ľ����
	 */
	public ResultSet exceuteQueue(String preparedSql, Object[] param){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn =  getConnection(); 
		try{
			pstmt=conn.prepareStatement(preparedSql);
			if(param!=null){
				for(int i=0;i<param.length;i++){
					pstmt.setObject(i+1, param[i]);
				}
			}
			rs=pstmt.executeQuery();
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return rs;
	}
}
