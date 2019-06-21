package com.nchu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SpringBoot整合Servlet方式二：通过方法
 * 
 * 不需要 @WebServlet(name = "SecondServlet",urlPatterns = "/Second")
 * 
 * @author 时间
 *
 */

public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SecondServlet:通过方法注册，不需要WebServlet注解");
	}

}
