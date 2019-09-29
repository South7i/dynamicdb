package com.south;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: Mr.裴
 * @create 2019/9/27
 * @Description: 启动类
 **/

@EnableTransactionManagement    //开启事务
@MapperScan("com.south.dao")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RunApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }

}
