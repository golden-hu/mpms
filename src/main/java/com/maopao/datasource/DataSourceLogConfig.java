package com.maopao.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by hugo on 2017/6/8.
 */
@Configuration
@MapperScan(basePackages = "com.maopao.mapper.log",sqlSessionTemplateRef = "logSqlSessionTemplate")
public class DataSourceLogConfig {
    @Bean(name = "logDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.log")
    @Primary
    public DataSource logDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "logSqlSessionFactory")
    @Primary
    public SqlSessionFactory logSqlSessionFactory(@Qualifier("logDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/log/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "logTransactionManager")
    @Primary
    public DataSourceTransactionManager logTransactionManager(@Qualifier("logDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "logSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate logSqlSessionTemplate(@Qualifier("logSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
