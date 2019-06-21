package com.nchu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * SpringBoot 整合 Servlet 方式一通过注解扫描完成Servlet组件的注册
 * 
 * @author 时间
 *
 */
@SpringBootApplication
@ServletComponentScan //在SpringBoot启动时会扫描@WebServlet,并将该类实例化
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);
	}

}
