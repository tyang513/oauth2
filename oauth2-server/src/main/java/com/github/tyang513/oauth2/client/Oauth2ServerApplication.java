package com.github.tyang513.oauth2.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.OAuth2ClientAuthenticationProcessingFilter;

import java.util.logging.Filter;

/**
 * Oauth Server主类
 * @author tao.yang@tendcloud.com
 * @date 2018-09-07
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableOAuth2Sso
public class Oauth2ServerApplication {

	private static Logger logger = LoggerFactory.getLogger(Oauth2ServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ServerApplication.class, args);
		logger.debug("debug日志");
		logger.info("info日志");
	}

	@Bean
	public Filter ssoFilter(ClientResources client, String path) {
		OAuth2ClientAuthenticationProcessingFilter filter = new OAuth2ClientAuthenticationProcessingFilter(path);
		OAuth2RestTemplate template = new OAuth2RestTemplate(client.getClient(), oauth2ClientContext);
		filter.setRestTemplate(template);
		UserInfoTokenServices tokenServices = new UserInfoTokenServices(
				client.getResource().getUserInfoUri(), client.getClient().getClientId());
		tokenServices.setRestTemplate(template);
		filter.setTokenServices(tokenServices);
		return filter;
	}
}
