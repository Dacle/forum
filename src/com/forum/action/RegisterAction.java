package com.forum.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.forum.bean.User;
import com.forum.domain.Register;
import com.forum.domain.Impl.RegisterImpl;

/**
 * Servlet implementation class RegisterAction
 */
@WebServlet("/RegisterAction")
public class RegisterAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Register register = new RegisterImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("成功调用"+this.getClass().getName());
		User user = new User();
		user.setUsername(request.getParameter("sname"));
		user.setUserpwd(request.getParameter("pass"));
		user.setSex(request.getParameter("gender"));
		register.saveUser(user);
		
		if("注册成功".equals(register.getMsg()))
			request.getRequestDispatcher("/html/register_success.html").forward(request, response);
		else{
			System.out.println("登录失败");
			response.sendRedirect("/html/register.html");
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
