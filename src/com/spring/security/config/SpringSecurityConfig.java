package com.spring.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter{
	//Configure the user login in memory db...
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin")
									.password("admin").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("manager")
									.password("manager").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("employee")
									.password("employee").roles("EMPLOYEE");
		
	}
	
	//configure security of web paths in application login logout etc
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()//restrict access based on the HTTPServletRequest
		.anyRequest().authenticated()//any request must be authenticated
		.and().formLogin()//custom login page
		.loginPage("/showMyLoginPage")//show out custom form at the request mapping
		.loginProcessingUrl("/authenticateTheUser")//submit to this url for processing
		//at here this will go to configure method above
		.permitAll()
		.and().logout().permitAll();
	}
	
}
