package com.bookapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	// dispacher servlet confgure automatically AbstractAnnotationConfigDispatcherServletInitializer
	
	// it is going to called by container after getRootConfigClasses
	//u have option to configure ur web setting ie mvc, view res
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("i can define bean for web app context");
		return new Class[] {WebConfig.class};
	}
	
	//this is called by container first of all
	// u have option to pass then name of the class, spring will put all the bean into
	//root app scope so that every web app context scope can get it
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("i can define bean for root app context");
		return new Class[] {ModelConfig.class};
	}

	//url for FC ie Dispacher servlet
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
