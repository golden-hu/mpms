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
@MapperScan(basePackages = "com.maopao.mapper.mapgo",sqlSessionTemplateRef = "mapGoSqlSessionTemplate")
public class DataSourceMapGoConfig {

    @Bean(name = "mapGoDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.mapgo")
    @Primary
    public DataSource mapGoDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mapGoSqlSessionFactory")
    @Primary
    public SqlSessionFactory mapGoSqlSessionFactory(@Qualifier("mapGoDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/mapgo/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "mapGoTransactionManager")
    @Primary
    public DataSourceTransactionManager mapGoTransactionManager(@Qualifier("mapGoDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "mapGoSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate mapGoSqlSessionTemplate(@Qualifier("mapGoSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
