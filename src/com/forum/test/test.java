package com.forum.test;

import com.forum.bean.User;
import com.forum.domain.Login;
import com.forum.domain.Impl.LoginImpl;
import com.forum.util.JsonUtils;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new LoginImpl();
		User user = new User();
		user.setUsername("hyq");
		user.setUserpwd("123456");
		login.login(user);
			user = login.getUser();
			String json = JsonUtils.objectToJson(user);
			System.out.println("json:   "+json);
	}

}
