package com.forum.util;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

public class JsonUtils {


    // ����jackson����
    private static ObjectMapper MAPPER = new ObjectMapper();
    /**
     * ������ת����json�ַ�����
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
     * ��json�����ת��Ϊ����
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
     * ��json����ת����pojo����list
     * 
     */

    public static <T>List<T> jsonToList(String jsonData, Class<T> beanType) {

    	//�˷������ڹ���List��Java����
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