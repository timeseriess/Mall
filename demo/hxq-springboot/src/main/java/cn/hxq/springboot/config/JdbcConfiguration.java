package cn.hxq.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration//声明一个类是一个java配置类
//@PropertySource("classpath:jdbc.properties")//读取资源文件
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

   @Autowired  //第一种@Autowired注入方式，用的最多
    private JdbcProperties jdbcProperties;

     /* 第二种构造方法注入方式
   public JdbcConfiguration(JdbcProperties jdbcProperties){
        this.jdbcProperties=jdbcProperties;
    }*/

/*    @Bean//把方法的返回值注入到spring容器中
    public DataSource dataSource(JdbcProperties jdbcProperties){//第三种@Bean方法形参注入方式
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }*/

    /*@Bean
    @ConfigurationProperties(prefix = "jdbc")//第四种直接在@Bean方法上使用@ConfigurationProperties(prefix = "jdbc")注入方式，有局限性
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        *//*dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());*//*
        return dataSource;
    }*/
}
