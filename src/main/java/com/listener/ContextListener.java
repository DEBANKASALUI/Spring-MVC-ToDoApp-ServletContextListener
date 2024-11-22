package com.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entity.ToDo;

public class ContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context created...");
		List<ToDo> list = new ArrayList<ToDo>();
		ServletContext context = sce.getServletContext();
		context.setAttribute("list", list);
	}

}
