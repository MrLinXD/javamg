package com.thinkgem.javamg.modules.sys.listener;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;

import com.thinkgem.javamg.modules.sys.service.SystemService;

/**
 * 自定义的ContextListener 继承 org.springframework.web.context.ContextLoaderListener
 */
public class WebContextListener extends org.springframework.web.context.ContextLoaderListener {
	
	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		if (!SystemService.printKeyLoadMessage()){/* 在项目context启动之前加载我们的参数,但是好像这里没干啥 */
			return null;
		}
		return super.initWebApplicationContext(servletContext);//spring的context初始化开始
	}
}
