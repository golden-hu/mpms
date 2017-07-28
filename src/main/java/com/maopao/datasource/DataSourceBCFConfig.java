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
@MapperScan(basePackages = "com.maopao.mapper.bcf",sqlSessionTemplateRef = "bcfSqlSessionTemplate")
public class DataSourceBCFConfig {

    @Bean(name = "bcfDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.bcf")
    @Primary
    public DataSource bcfDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "bcfSqlSessionFactory")
    @Primary
    public SqlSessionFactory bcfSqlSessionFactory(@Qualifier("bcfDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/bcf/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "bcfTransactionManager")
    @Primary
    public DataSourceTransactionManager bcfTransactionManager(@Qualifier("bcfDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "bcfSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate bcfSqlSessionTemplate(@Qualifier("bcfSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
