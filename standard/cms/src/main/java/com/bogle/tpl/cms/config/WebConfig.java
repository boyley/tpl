package com.bogle.tpl.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2015/8/6.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/").setViewName("html/sign/sign");
        registry.addViewController("/login").setViewName("html/sign/login");
        registry.addViewController("/signup").setViewName("html/sign/signup");
        registry.addViewController("/forgotpwd").setViewName("html/sign/forgotpwd");
        registry.addViewController("/footer").setViewName("html/inc/footer");

    }
}
