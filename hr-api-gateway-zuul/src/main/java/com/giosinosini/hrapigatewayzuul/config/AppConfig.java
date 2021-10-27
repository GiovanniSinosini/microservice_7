package com.giosinosini.hrapigatewayzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class AppConfig {
	
	@Bean
	public JwtAccessTokenConverter AccessTokenConverter() {
		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
		tokenConverter.setSigningKey("MY-SECRET-KEY"); //temporary test
		return tokenConverter;
	}
	
	@Bean
	public JwtTokenStore tokenStore() {  // read information from token
		return new JwtTokenStore(AccessTokenConverter());
	}

}
