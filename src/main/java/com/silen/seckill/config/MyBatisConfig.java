package com.silen.seckill.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Author: silenZheng
 * @Date: 2019/10/31 11:43 上午
 */
@Configuration
public class MyBatisConfig {

    @Autowired
    public DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        //分页插件PageHelper
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);
        //添加插件
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper});

        PathMatchingResourcePatternResolver reresolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(reresolver.getResources("classpath:/mybatis/mapper/*.xml"));
        sqlSessionFactoryBean.setConfigLocation(reresolver.getResource("classpath:/mybatis/mybatis-config.xml"));

        return sqlSessionFactoryBean.getObject();
    }
}
