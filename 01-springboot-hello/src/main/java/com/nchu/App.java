package com.nchu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 启动类
 * 位置可以和controller位于同一个包下，或者位于controller的上一级包中，不能放在平级以及子包下
 * @author 时间
 *
 */

@SpringBootApplication
public class App {  

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
