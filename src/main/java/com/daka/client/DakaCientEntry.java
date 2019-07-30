package com.daka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Date: 2019/07/19
 * Time: 下午10:42
 *
 * @author manqs
 */

@EnableDiscoveryClient
@SpringBootApplication
public class DakaCientEntry {

    public static void main(String[] args) {
        SpringApplication.run(DakaCientEntry.class, args);
    }
}