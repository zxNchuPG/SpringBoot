package com.nchu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.nchu.servlet.SecondServlet;

/**
 * SpringBoot 整合 Servlet 方式二
 * 
 * 不用WebServlet注解
 * 
 * @author 时间
 *
 */
@SpringBootApplication
public class App2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App2.class, args);
	}
	
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
		bean.addUrlMappings("second");
		return bean;
	}
}
