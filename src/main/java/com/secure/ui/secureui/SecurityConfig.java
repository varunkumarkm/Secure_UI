package com.secure.ui.secureui;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration{

	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeHttpRequests()
		.anyRequest().permitAll()
		.anyRequest().authenticated()
		.and()
		.oauth2Login();//Now we can access both home and report 
	}
}
