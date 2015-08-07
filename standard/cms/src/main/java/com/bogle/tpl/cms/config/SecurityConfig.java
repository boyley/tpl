package com.bogle.tpl.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Administrator on 2015/6/19.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/inc/*","/bower/**","/js/*","/css/*","/img/*","/fonts*","/html/*","/sign/*");
    }
}