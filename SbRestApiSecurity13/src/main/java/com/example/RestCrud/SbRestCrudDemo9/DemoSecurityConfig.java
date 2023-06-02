package com.example.RestCrud.SbRestCrudDemo9;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
	
	
	/*If we are not using any hardcode values
	 * 
	 * 
	@Bean
	public InMemoryUserDetailsManager userDetailsManager()
	{
		UserDetails John = User.builder().username("John").password("{noop}test123").roles("EMPLOYEE").build();
		UserDetails Ranjith = User.builder().username("Ranjith").password("{noop}test123").roles("EMPLOYEE","MANAGER").build();
		UserDetails Vikas = User.builder().username("Vikas").password("{noop}test123").roles("EMPLOYEE","MANAGER","ADMIN").build();
		return new InMemoryUserDetailsManager(John,Ranjith,Vikas);
		
	}
	*/
	
	//We can use password from DB instead of hardcoding
	//This is used only when we used default spring tables(users and autthourities and same columns
	/*
	@Bean 
	 public UserDetailsManager userDetailsManager(DataSource dataSource) { 
	 return new JdbcUserDetailsManager(dataSource); 
	 }
	
	*/
	
	
	
	//When we use custom tables based on our needs
	@Bean 
	 public UserDetailsManager userDetailsManager(DataSource dataSource) { 
	 JdbcUserDetailsManager theUserDetailsManager = new JdbcUserDetailsManager(dataSource); 
	 theUserDetailsManager 
	 .setUsersByUsernameQuery("select user_id, pw, active from members where user_id=?"); 
	 
	 theUserDetailsManager 
	 .setAuthoritiesByUsernameQuery("select user_id, role from roles where user_id=?"); 
	 return theUserDetailsManager; 
	 }
	
	
	
	//To give specific permission to roles(ex Employee can only read info, manager can edit or create user, 
	//admin can delete info)
	
	@Bean 
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception { 
	 http.authorizeHttpRequests(configurer -> 
	 configurer 
	 .requestMatchers(HttpMethod.GET, "/test/employees").hasRole("EMPLOYEE") 
	 .requestMatchers(HttpMethod.GET, "/test/employees/**").hasRole("EMPLOYEE") 
	 .requestMatchers(HttpMethod.POST, "/test/employees").hasRole("MANAGER") 
	 .requestMatchers(HttpMethod.PUT, "/test/employees").hasRole("MANAGER") 
	 .requestMatchers(HttpMethod.DELETE, "/test/employees/**").hasRole("ADMIN"));
	 
	 
	 // use HTTP Basic authentication 
	 http.httpBasic(); 
	 
	// disable Cross Site Request Forgery (CSRF) 
	 //In general its not used for stateless REST API that use POST PUT DELETE and/or PATCH
	 http.csrf().disable();
	 
	 return http.build(); 
	}
	

}
