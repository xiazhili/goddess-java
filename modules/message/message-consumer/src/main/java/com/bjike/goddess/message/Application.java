package com.bjike.goddess.message;

import com.bjike.goddess.message.kafka.KafkaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * 扫描com.bjike.goddess.common.consumer 加入过滤器引入userToken
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.bjike.goddess.message.action","com.bjike.goddess.message.kafka", "com.bjike.goddess.common.consumer"},
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value = {Configuration.class})})
@ImportResource("classpath:app.xml")
public class Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
        new KafkaConsumer().consumer();
        System.in.read();
    }

}
