package com.zhangyongsic.seata.eureka.client.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EurekaClientOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientOneApplication.class,args);
    }
}
