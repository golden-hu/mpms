package com.maopao.config;

import com.maopao.MpmsApplication;
import com.maopao.fw.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by hugo on 2017/6/21.
 */
@Configuration
@ComponentScan(basePackageClasses = MpmsApplication.class,useDefaultFilters = true)
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    @Autowired
    LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/webapi/**").excludePathPatterns("/web/login");
        super.addInterceptors(registry);
    }
}
