package com.forum.action;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.forum.bean.User;
import com.forum.domain.Login;
import com.forum.domain.Impl.LoginImpl;
import com.forum.util.JsonUtils;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    Login login = new LoginImpl();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername(request.getParameter("userName"));
		user.setUserpwd(request.getParameter("password"));
		System.out.println(this.getClass().getName()+"   "+request.getParameter("userName")+request.getParameter("password"));
		login.login(user);
		
		if("登陆成功".equals(login.getMsg())){
			user = login.getUser();
			String json = JsonUtils.objectToJson(user);
			System.out.println(json);
			PrintStream out = new PrintStream(response.getOutputStream());  
		    response.setContentType("text/html;charSet=utf-8");  
		    //搞完把json打印在本Servlet上，之后前台页面读这页的内容就可以了  
		    out.println(json);  
		    out.close();  
		}else{
			System.out.println(this.getClass().getName()+login.getMsg());
			response.sendRedirect("/html/loginBox1.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
