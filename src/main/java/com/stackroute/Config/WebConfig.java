package com.stackroute.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
public class WebConfig {
    @Autowired
    private Environment environment;
    @Bean("dataSource")
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("spring.datasource.url"));
        dataSource.setUrl(environment.getProperty("spring.datasource.driverClassName"));

        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));

        return dataSource;
    }

}