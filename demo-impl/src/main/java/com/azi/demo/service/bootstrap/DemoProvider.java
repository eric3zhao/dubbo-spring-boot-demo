package com.azi.demo.service.bootstrap;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author azizwz@aliyun.com
 *         Function:
 */
@SpringBootApplication
@MapperScan("com.azi.demo.service.dao")
@DubboComponentScan("com.azi.demo.service.impl")
public class DemoProvider {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoProvider.class).web(WebApplicationType.NONE).run(args);
    }
}
