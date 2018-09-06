package com.spring.security.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//Base class for org.springframework.web.WebApplicationInitializer implementations 
//that register a DispatcherServlet configured with annotated classes, 
//e.g. Spring's @Configuration classes.
public class SpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	//no root config classes for out project 
	//only servlet config classes
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {SpringMVCConfig.class};
	}
	//handler servlet mapped
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
