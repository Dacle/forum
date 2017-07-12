package com.forum.util;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbUtils {
   /*
    * ��rs���ת���ɶ����б�
    * @param rs jdbc�����
    * @param clazz �����ӳ����
    * return ��װ�˶���Ľ���б�
    */
   public static List populate(ResultSet rs , Class clazz) {
       //�������Ԫ�ض���
       ResultSetMetaData rsmd = null;
	try {
		rsmd = rs.getMetaData();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       //��ȡ�������Ԫ�ظ���
        int colCount = 0;
		try {
			colCount = rsmd.getColumnCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        System.out.println("#");
//        for(int i = 1;i<=colCount;i++){
//            System.out.println(rsmd.getColumnName(i));
//            System.out.println(rsmd.getColumnClassName(i));
//            System.out.println("#");
//        }
        //���ؽ�����б���
        List list = new ArrayList();
        //ҵ��������������
        Field[] fields = clazz.getDeclaredFields();
        try {
			while(rs.next()){//��ÿһ����¼���в���
			    Object obj = clazz.newInstance();//����ҵ�����ʵ��
			    //��ÿһ���ֶ�ȡ�����и�ֵ
			    for(int i = 1;i<=colCount;i++){
			        Object value = rs.getObject(i);
			        //Ѱ�Ҹ��ж�Ӧ�Ķ�������
			        for(int j=0;j<fields.length;j++){
			            Field f = fields[j];
			            //���ƥ����и�ֵ
			            if(f.getName().equalsIgnoreCase(rsmd.getColumnName(i))){
			                boolean flag = f.isAccessible();
			                f.setAccessible(true);
			                f.set(obj, value);
			                f.setAccessible(flag);
			            }
			        }
			    }
			    list.add(obj);
			}
		} catch (InstantiationException | IllegalAccessException | SecurityException | IllegalArgumentException
				| SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return list;
   }
} 