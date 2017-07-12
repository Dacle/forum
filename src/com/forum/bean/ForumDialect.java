package com.forum.bean;

import org.hibernate.dialect.Oracle10gDialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.StringType;

public class ForumDialect extends Oracle10gDialect{
	
	 public ForumDialect() {  
		 super();  
	        // TODO Auto-generated constructor stub  
		 this.registerFunction("f_regist_users", new SQLFunctionTemplate(new StringType(), "f_regist_users(?1,?2,?3)")); 
	    }  
}
