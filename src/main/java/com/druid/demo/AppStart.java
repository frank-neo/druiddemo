package com.druid.demo;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.druid.demo.mapper")
@ServletComponentScan//这行是为了避免扫描不到Druid的Servlet
public class AppStart {
    public static void main(String[] args) {

        SpringApplication.run(AppStart.class, args);

    }

    //注解方式读取连接属性
    @Bean("duridDatasource")
    //确保配置文件中spring.datasource后面的前缀和DruidDataSource中 properties.getProperty()参数相同！【如druid:initialSize:等价于druid.initialSize】
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource() {
        return new DruidDataSource();
    }
}
