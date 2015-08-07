package com.bogle.tpl.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by lenovo on 2015/5/31.
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.bogle.tpl.*.persistence")
public class DatabaseConfig {

    @Bean(initMethod = "init", destroyMethod = "close")
    @ConfigurationProperties(prefix = "spring.dataSource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }


    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext applicationContext, @Value("${spring.mybatis.mapper-location}") String mapperLocations, @Value("${spring.mybatis.config-location}") String configLocation) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setConfigLocation(applicationContext.getResource(configLocation));
        sessionFactory.setMapperLocations(applicationContext.getResources(mapperLocations));
        return sessionFactory.getObject();
    }

    @Bean
    public DruidStatInterceptor druidStatInterceptor() {
        return new DruidStatInterceptor();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public JdkRegexpMethodPointcut jdkRegexpMethodPointcut() {
        JdkRegexpMethodPointcut methodPointcut = new JdkRegexpMethodPointcut();
        methodPointcut.setPatterns("com.bogle.tpl.*.service.*");
        return methodPointcut;
    }




//    @Bean
//    @Autowired
//    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
//        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource);
//        return dataSourceTransactionManager;
//    }

}