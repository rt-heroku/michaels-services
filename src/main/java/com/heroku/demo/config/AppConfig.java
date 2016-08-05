/**
 * 
 */
package com.heroku.demo.config;


import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author rtorres
 *
 */
@Configuration
@ComponentScan(basePackages={"com.heroku.demo"},
		excludeFilters=@ComponentScan.Filter(type=FilterType.REGEX, pattern={"com.heroku.demo.controllers.*"}))
@PropertySource(value = { "classpath:application.properties" })
@EnableAspectJAutoProxy
@EnableCaching
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer()
	{
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public CacheManager cacheManager()
	{
		return new ConcurrentMapCacheManager();
	}
}
