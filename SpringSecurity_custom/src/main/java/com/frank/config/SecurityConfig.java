package com.frank.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	/**
     * 說明: SpringBoot2.7.1版本後
     *    permitAll() 代表放行該資源,該資源為公共資源，無需認證和授權可以直接訪問
     *    anyRequest().authenticated() 代表所有請求,必須認證之後才能訪問
     *    formLogin() 代表開啟表單認證
     * 注意: 放行資源必須放在所有認證請求之前!
     */
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	http.authorizeHttpRequests((requests) -> requests
    				.mvcMatchers("/index")
    				.permitAll()
    				.mvcMatchers("/login")
    				.permitAll()
    				.anyRequest().authenticated())
					.formLogin((formLogin) ->
						{
							try {
								formLogin
									.usernameParameter("account")
									.passwordParameter("pwd")
									.loginPage("/login")
									.failureUrl("/login")
									.loginProcessingUrl("/doLogin")
									.and()
									.csrf().disable();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						});
		return http.build();
    	
    	
//    	http.authorizeHttpRequests((requests) -> requests
//    			.mvcMatchers("/index")
//    			.permitAll()
//    			.anyRequest().authenticated());
//		http.formLogin(withDefaults());
//		http.httpBasic(withDefaults());
//		return http.build();
    }

}
