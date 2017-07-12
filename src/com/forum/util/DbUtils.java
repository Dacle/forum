package com.forum.util;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbUtils {
   /*
    * 将rs结果转换成对象列表
    * @param rs jdbc结果集
    * @param clazz 对象的映射类
    * return 封装了对象的结果列表
    */
   public static List populate(ResultSet rs , Class clazz) {
       //结果集的元素对象
       ResultSetMetaData rsmd = null;
	try {
		rsmd = rs.getMetaData();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       //获取结果集的元素个数
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
        //返回结果的列表集合
        List list = new ArrayList();
        //业务对象的属性数组
        Field[] fields = clazz.getDeclaredFields();
        try {
			while(rs.next()){//对每一条记录进行操作
			    Object obj = clazz.newInstance();//构造业务对象实体
			    //将每一个字段取出进行赋值
			    for(int i = 1;i<=colCount;i++){
			        Object value = rs.getObject(i);
			        //寻找该列对应的对象属性
			        for(int j=0;j<fields.length;j++){
			            Field f = fields[j];
			            //如果匹配进行赋值
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