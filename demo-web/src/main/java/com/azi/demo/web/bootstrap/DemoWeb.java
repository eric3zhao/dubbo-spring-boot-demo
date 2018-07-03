
package com.azi.demo.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author azizwz@aliyun.com
 *         Function:
 */
@SpringBootApplication(scanBasePackages = "com.azi.demo.web.controller")
public class DemoWeb {
    public static void main(String[] args) {
        SpringApplication.run(DemoWeb.class, args);
    }
}
