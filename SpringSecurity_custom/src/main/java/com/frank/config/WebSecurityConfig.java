package com.frank.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests() //開啟權限管理
//		    .mvcMatchers("/index") //匹配的請求
//		    .permitAll()  //放行
//		    .anyRequest() //任何請求
//		    .authenticated() //需要驗證
//		    .and()
//		    .formLogin(); //表單驗證
//	}
//
//}
