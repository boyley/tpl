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
        registry.addViewController("/sign").setViewName("html/sign/sign");
        registry.addViewController("/sign/login").setViewName("html/sign/login");
        registry.addViewController("/sign/signup").setViewName("html/sign/signup");
        registry.addViewController("/sign/forgotpwd").setViewName("html/sign/forgotpwd");
        registry.addViewController("/inc/footer").setViewName("html/inc/footer");

    }
}
