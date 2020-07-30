package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * PPTX
 * 12:06
 * 2020/7/28
 */
@Configuration
public class CorsWebConfig {
    @Bean
    public CorsWebFilter corsWebFilter(){
        // cors配置类
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedOrigin("http://manager.gmall.com");
        corsConfiguration.setAllowCredentials(true);
    
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration( "/**",corsConfiguration);
        return new CorsWebFilter(configurationSource);
    }
    
}
