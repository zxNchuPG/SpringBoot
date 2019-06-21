package com.nchu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 * springBoot整合Listener
 *
 *<listener>
 *	<listener-class>com.nchu.listener.FirstListener</listener-class>
 *</listener>
 * @author 时间
 *
 */
@WebListener
public class FirstListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("listener.....init....");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("listener.....destroy....");

	}

}
