package com.chhsia.rest.webconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.chhsia.rest.controller.EmployeeController;

/**
 * @author Chee-Hong This class replace the standard applicationContext.xml.
 *
 */
@Configuration
@EnableWebMvc // equivalent to <mvc:annotation-driven />
@ComponentScan(basePackageClasses = { EmployeeController.class })
public class ApplicationContextConfig extends WebMvcConfigurationSupport {

	public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
		RequestMappingHandlerAdapter handlerAdapter = super.requestMappingHandlerAdapter();
		handlerAdapter.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		return handlerAdapter;
	}

}
