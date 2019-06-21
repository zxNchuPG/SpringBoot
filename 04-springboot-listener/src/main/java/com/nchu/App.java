package com.nchu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.nchu.listener.FirstListener;

/**
 * SpringBoot 整合 Listener 方式一，注解方式
 * @author 时间
 *
 */
@SpringBootApplication
@ServletComponentScan
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	/**
	 * 方式二：通过方法
	 */
	@Bean
	public ServletListenerRegistrationBean<FirstListener> getServletListenerRegistrationBean(){
		ServletListenerRegistrationBean<FirstListener> bean = new ServletListenerRegistrationBean<FirstListener>(new FirstListener());
		return bean;
	}
}
