package com.e45240.okta.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author du.yang
 * @date 2018-10-12 16:29
 */
@EnableOAuth2Sso
@Configuration
public class SpringSecurityWebAppConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/images/**", "/js/**", "/css/**").permitAll()
				.anyRequest().authenticated();
	}

}
