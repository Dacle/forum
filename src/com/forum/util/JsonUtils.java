package com.forum.util;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

public class JsonUtils {


    // 定义jackson对象
    private static ObjectMapper MAPPER = new ObjectMapper();
    /**
     * 将对象转换成json字符串。
     *
     */
    public static String objectToJson(Object data) {
        String string = null;
		try {
			string = MAPPER.writeValueAsString(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          return string;
        
    }
    
    /**
     * 将json结果集转化为对象
     * 
     * 
     */
    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
    
    /**
     * 将json数据转换成pojo对象list
     * 
     */

    public static <T>List<T> jsonToList(String jsonData, Class<T> beanType) {

    	//此方法用于构造List的Java类型
    	JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
    	try {
    		List<T> list = MAPPER.readValue(jsonData, javaType);
    		return list;
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    
} 