package com.student.configration;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable()
				.authorizeRequests().anyRequest().authenticated()
				.and()
				.httpBasic();

	}
}
//
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//		auth.inMemoryAuthentication().withUser("root").password("akhil").roles("NORMAL");
//		auth.inMemoryAuthentication().withUser("root").password("nikhil").roles("ADMIN");
//
////		auth.inMemoryAuthentication().withUser("root").password(this.passwordEncoder().encode("akhil")).roles("NORMAL");
////		auth.inMemoryAuthentication().withUser("root").password(this.passwordEncoder().encode("nikhil")).roles("ADMIN");
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder(){
//
//		return NoOpPasswordEncoder.getInstance();
//	}
//
////	@Bean
////	public PasswordEncoder passwordEncoder(){
////
////		return new BCryptPasswordEncoder();
////	}
//}
