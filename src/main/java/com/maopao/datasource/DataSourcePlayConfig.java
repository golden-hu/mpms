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
@MapperScan(basePackages = "com.maopao.mapper.play",sqlSessionTemplateRef = "playSqlSessionTemplate")
public class DataSourcePlayConfig {

    @Bean(name = "playDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.play")
    @Primary
    public DataSource playDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "playSqlSessionFactory")
    @Primary
    public SqlSessionFactory playSqlSessionFactory(@Qualifier("playDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/play/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "playTransactionManager")
    @Primary
    public DataSourceTransactionManager playTransactionManager(@Qualifier("playDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "playSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate playSqlSessionTemplate(@Qualifier("playSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
