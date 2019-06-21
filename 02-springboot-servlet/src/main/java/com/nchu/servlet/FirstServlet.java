package com.nchu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SpringBoot 整合 Servlet方式一
 * 
 * 以往在Web.xml中对Servlet的配置
 * 
 * <servlet>
 *		<servlet-name>FirstServlet</servlet-name>
 *		<servlet-class>com.bjsxt.servlet.FirstServlet</servlet-class>
 * </servlet>
 *
 *	<servlet-mapping>
 * 		<servlet-name>FirstServlet</servlet-name>
 * 		<url-pattern>/first</url-pattern>
 *	</servlet-mapping>
 *
 * @author 时间
 *
 */

@WebServlet(name="FirstServlet",urlPatterns = "/first")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FirstServlet:通过注解方式扫描WebServlet注解进行注册");
	}
	
}
